import sys

def main():
    input = sys.stdin.read
    data = input().split()

    index = 0
    n = int(data[index])
    m = int(data[index + 1])
    index += 2

    penal = [0] * (n + 1)
    solved = [False] * (n + 1)

    for _ in range(m):
        num = int(data[index])
        index += 1
        str_ = data[index]
        index += 1
        if str_[0] == 'A':
            solved[num] = True
        elif solved[num] is False:
            penal[num] += 1

    correct_ans = 0
    num_penal = 0
    for i in range(1, n + 1):
        if solved[i]:
            correct_ans += 1
            num_penal += penal[i]

    print(f"{correct_ans} {num_penal}")

if __name__ == "__main__":
    main()