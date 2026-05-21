import sys

def get_input():
    return input().split()

def main():
    a, tA = map(int, get_input())
    b, tB = map(int, get_input())
    timing = input()
    hrs, mins = map(int, timing[:2] + timing[3:])
    sim_departure = hrs * 60 + mins
    sim_arrival = sim_departure + tA
    counter = 0
    for i in range(300, 1440, b):
        bus_departure = i
        bus_arrival = i + tB
        if bus_departure >= sim_arrival or sim_departure >= bus_arrival:
            continue
        counter += 1
    print(counter)

if __name__ == "__main__":
    main()