import sys

def main():
    sc = input()
    while sc.split(","):
        l = [int(x) for x in sc.split(",")]
        d = sum(l)
        v = [int(x) for x in sc.split(",")][:10]
        t = (d / (v[0] + v[1]))
        d = 0
        for i in range(11):
            if v[0] * t <= d:
                print(i)
                break
            else:
                d += l[i]

main()
