import stdio
import collections
class codeforces_265_B:
    def __init__(self):
        self.scn = stdio.input()
        self.n = int(self.scn.next())
        self.arr = [int(self.scn.next()) for _ in range(self.n)]
        self.ans = self.arr[0] + 1
        for i in range(1, len(self.arr)):
            self.ans += abs(self.arr[i] - self.arr[i - 1]) + 2
        print(self.ans)

