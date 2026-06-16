FROM ubuntu:22.04

ENV DEBIAN_FRONTEND=noninteractive

RUN apt-get update && apt-get install -y \
    curl \
    wget \
    git \
    build-essential \
    software-properties-common \
    unzip \
    && rm -rf /var/lib/apt/lists/*

# Instala Python 3.10
RUN add-apt-repository ppa:deadsnakes/ppa && \
    apt-get update && apt-get install -y \
    python3.10 \
    python3.10-dev \
    python3.10-distutils \
    && rm -rf /var/lib/apt/lists/*

RUN curl -sS https://bootstrap.pypa.io/get-pip.py | python3.10
RUN ln -sf /usr/bin/python3.10 /usr/bin/python3 && \
    ln -sf /usr/bin/python3.10 /usr/bin/python

# Instala Java 21 (Opcional Maven, mas mantido caso os scripts src/ chamem o mvn)
RUN apt-get update && apt-get install -y \
    openjdk-21-jdk \
    maven \
    && rm -rf /var/lib/apt/lists/*

WORKDIR /app

# Instala dependências do projeto (pandas, numpy ou o que os scripts usarem)
COPY requirements.txt .
RUN pip3 install --no-cache-dir -r requirements.txt

# Deixamos o bash pronto como ponto de entrada padrão
CMD ["/bin/bash"]