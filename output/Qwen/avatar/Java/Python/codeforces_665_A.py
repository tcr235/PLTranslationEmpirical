import sys

def main():
    input_stream = sys.stdin.read
    data = input_stream().split()

    a = int(data[0])
    tA = int(data[1])
    b = int(data[2])
    tB = int(data[3])
    timing = data[4]

    hrs = int(timing[:2])
    mins = int(timing[-2:])
    simDeparture = hrs * 60 + mins
    simArrival = simDeparture + tA

    counter = 0
    for i in range(300, 1440, b):
        busDeparture = i
        busArrival = i + tB
        if busDeparture >= simArrival or simDeparture >= busArrival:
            continue
        counter += 1

    print(counter)

if __name__ == "__main__":
    main()