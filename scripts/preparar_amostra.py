import os
import shutil
import random
from pathlib import Path

DATASET_ORIGINAL = "dataset/avatar" #mudar quando necessário
DATASET_REDUZIDO = "dataset_reduzido/avatar"
LINGUAGENS = {"Python": ".py", "Java": ".java"}
TAMANHO_AMOSTRA = 100

def preparar_amostra():
    os.makedirs(DATASET_REDUZIDO, exist_ok=True)

    for linguagem, extensao in LINGUAGENS.items():
        print(f"\nProcessando {linguagem}...")
        
        caminho_codigo = Path(f"{DATASET_ORIGINAL}/{linguagem}/Code")
        caminho_testes = Path(f"{DATASET_ORIGINAL}/{linguagem}/TestCases")
        
        if not caminho_codigo.exists() or not caminho_testes.exists():
            print(f"  [ERRO] Pastas de {linguagem} não encontradas. Verifique o caminho.")
            continue

        todos_codigos = list(caminho_codigo.glob(f"*{extensao}"))
        codigos_validos = []

        for arquivo_codigo in todos_codigos:
            id_codigo = arquivo_codigo.stem 
            
            testes_associados = list(caminho_testes.glob(f"{id_codigo}*"))
            
            if len(testes_associados) > 0:
                codigos_validos.append((arquivo_codigo, testes_associados))

        print(f"  Encontrados {len(codigos_validos)} códigos com testes válidos.")

        quantidade_sorteio = min(TAMANHO_AMOSTRA, len(codigos_validos))
        amostra = random.sample(codigos_validos, quantidade_sorteio)

        destino_codigo = Path(f"{DATASET_REDUZIDO}/{linguagem}/Code")
        destino_testes = Path(f"{DATASET_REDUZIDO}/{linguagem}/TestCases")
        destino_codigo.mkdir(parents=True, exist_ok=True)
        destino_testes.mkdir(parents=True, exist_ok=True)

        for arq_cod, testes in amostra:
            shutil.copy2(arq_cod, destino_codigo / arq_cod.name)
            for teste in testes:
                shutil.copy2(teste, destino_testes / teste.name)
                
        print(f"  [SUCESSO] {quantidade_sorteio} códigos e seus testes copiados para o dataset reduzido!")

if __name__ == "__main__":
    preparar_amostra()
    print("\nCuradoria finalizada.")