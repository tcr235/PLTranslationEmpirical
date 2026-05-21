MOD = 1000000007

class atcoder_ABC122_D:
    def __init__(self):
        self.N = int(input())
        self.tokens = ["A", "C", "G", "T"]
        self.memo = [{} for _ in range(self.N + 1)]

    def is_ok(self, last4):
        if "AGC" in last4:
            return False
        for i in range(3):
            vals = list(last4)
            vals[i], vals[i + 1] = vals[i + 1], vals[i]
            s = ''.join(vals)
            if "AGC" in s:
                return False
        return True

    def dfs(self, current, last3):
        if last3 in self.memo[current]:
            return self.memo[current][last3]
        if current == self.N:
            return 1
        result = 0
        for t in self.tokens:
            if self.is_ok(last3[-2:] + t):
                result += self.dfs(current + 1, last3[1:] + t) % MOD
        self.memo[current][last3] = result
        return result

def main():
    ins = atcoder_ABC122_D()
    print(ins.dfs(0, 'TTT'))

if __name__ == '__main__':
    main()