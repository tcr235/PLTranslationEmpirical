import numpy as np

def main():
    num = np.array([int(x) for x in input().split()], dtype=int)
    for i in range(10):
        for j in range(i+1):
            if num[j] < num[j+1]:
                num[0] = num[j]
                num[j] = num[j+1]
                num[j+1] = num[0]
    print(num[0])
    print(num[1])
    print(num[2])

if __name__ == '__main__':
    main()
