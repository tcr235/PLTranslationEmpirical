MOD = 1000000007

class ATCODER_ABC122_D:
    def __init__(self):
        self.N = int(input())
        self.tokens = ['A', 'C', 'G', 'T']
        self.memo = [{}, {}, {}, {}] * ((self.N // 5) + 1)

    def isok(self, last4):
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
        if last3 in self.memo[current][current % 5]:
            return self.memo[current][current % 5][last3]
        if current == self.N:
            return 1
        result = 0
        for t in self.tokens:
            if self.isok(last3[-2:] + t):
                result += self.dfs(current + 1, last3[1:] + t) % MOD
        if current not in self.memo[current][current % 5]:
            self.memo[current][current % 5][last3] = {}
        self.memo[current][current % 5][last3] = result
        return result

def main():
    ins = ATCODER_ABC122_D()
    print(ins.dfs(0, 'TTT'))

if __name__ == '__main__':
    main()