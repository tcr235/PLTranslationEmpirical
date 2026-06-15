import sys

def main():
    sc = input()
    n = len(sc)
    ans = 0
    for mask in range(1<<(n-1)):
        sum = 0
        x = sc[0]
        for i in range(n-1):
            if mask&(1<<i) > 0:
                x += "+" + sc[i+1]
            else:
                x += sc[i+1]
        split = x.split("+")
        for i in range(len(split)):
            sum += int(split[i])
        ans += sum
    print(ans)

