from typing import List

def permutation(lst: List[str], target: str, ans: str) -> List[str]:
    if len(target) <= 1:
        lst.append(ans + target)
    else:
        for i in range(len(target)):
            permutation(lst, target[:i] + target[i+1:], ans + target[i])
    return lst

def main():
    n = int(input())
    line = [[input() for _ in range(n)] for _ in range(2)]
    number = ''.join(map(str, range(1, n+1)))
    lstA = []
    permutation(lstA, number, "")
    sum_val = 0
    for j in range(len(line)):
        for i in range(len(lstA)):
            if lstA[i] == line[j][0]:
                if sum_val == 0:
                    sum_val += i
                else:
                    sum_val -= i
    print(abs(sum_val))

if __name__ == "__main__":
    main()