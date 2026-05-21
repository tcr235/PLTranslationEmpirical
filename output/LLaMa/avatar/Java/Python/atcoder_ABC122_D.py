from typing import List, Dict
import sys

MOD = 10**9 + 7
TOKENS = ["A", "C", "G", "T"]

class atcoder_ABC122_D:
    def __init__(self, n: int):
        self.N = n
        self.memo: List[Dict[str, int]] = [[] for _ in range(n + 1)]

    def isOK(self, last4: str) -> bool:
        if "AGC" in last4:
            return False
        for i in range(3):
            vals = list(last4)
            vals[i], vals[i + 1] = last4[i + 1], last4[i]
            s = "".join(vals)
            if "AGC" in s:
                return False
        return True

    def dfs(self, current: int, last3: str) -> int:
        if (current, last3) in self.memo[current]:
            return self.memo[current][(current, last3)]
        if current == self.N:
            return 1
        result = 0
        for c in TOKENS:
            if self.isOK(last3 + c):
                result += self.dfs(current + 1, last3[1:] + c)
                result %= MOD
        self.memo[current][(current, last3)] = result
        return result

    def calc(self) -> int:
        return self.dfs(0, "TTT")

def main():
    n = int(sys.stdin.readline())
    ins = atcoder_ABC122_D(n)
    print(ins.calc())

if __name__ == "__main__":
    main()