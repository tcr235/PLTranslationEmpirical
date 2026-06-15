def main():
    n = int(input())
    c = [int(input()) for _ in range(n - 1)]
    s = [int(input()) for _ in range(n - 1)]
    f = [int(input()) for _ in range(n - 1)]

    for i in range(n - 1):
        time = s[i] + c[i]
        for j in range(i + 1, n - 1):
            if time % f[j] != 0:
                time += f[j] - (time % f[j])
            if time < s[j]:
                time = s[j]
            time += c[j]
        print(time)
    print(0)
