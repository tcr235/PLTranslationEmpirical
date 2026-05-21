import sys

class TaskC:
    def solve(self, testNumber, n, cnt):
        for i in range(n):
            str = input()
            if str[0] == 'M':
                cnt[0] += 1
            elif str[0] == 'A':
                cnt[1] += 1
            elif str[0] == 'R':
                cnt[2] += 1
            elif str[0] == 'C':
                cnt[3] += 1
            elif str[0] == 'H':
                cnt[4] += 1

        res = (cnt[0] * cnt[1] * cnt[2] +
              cnt[0] * cnt[1] * cnt[3] +
              cnt[0] * cnt[1] * cnt[4] +
              cnt[0] * cnt[2] * cnt[3] +
              cnt[0] * cnt[2] * cnt[4] +
              cnt[0] * cnt[3] * cnt[4] +
              cnt[1] * cnt[2] * cnt[3] +
              cnt[1] * cnt[2] * cnt[4] +
              cnt[1] * cnt[3] * cnt[4] +
              cnt[2] * cnt[3] * cnt[4])

        print(res)

def main():
    n = int(input())
    cnt = [0] * 5
    for i in range(n):
        str = input()
        if str[0] == 'M':
            cnt[0] += 1
        elif str[0] == 'A':
            cnt[1] += 1
        elif str[0] == 'R':
            cnt[2] += 1
        elif str[0] == 'C':
            cnt[3] += 1
        elif str[0] == 'H':
            cnt[4] += 1

    solver = TaskC()
    solver.solve(1, n, cnt)

if __name__ == "__main__":
    main()