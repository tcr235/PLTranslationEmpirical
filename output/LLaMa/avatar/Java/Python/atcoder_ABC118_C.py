import sys
import random

class atcoder_ABC118_C:
    def __init__(self):
        self.n = int(input())
        self.a = []

        if self.n == 1:
            self.a.append(int(input()))
            self.answer()
            sys.exit(0)

        for _ in range(self.n):
            self.a.append(int(input()))

        self.a.sort()

        if self.a[-1] == 0:
            print(0)
            sys.exit(0)

        self.ans = 0
        while True:
            if len(self.a) == 1:
                self.ans = self.a[0]
                break
            self.a = self.func(self.a)

        print(self.ans)

    def func(self, A):
        a = A[:]
        min_val = 0
        for i in range(len(a)):
            if a[i] == 0:
                a.pop(i)
                i -= 1
            else:
                if min_val != 0:
                    a[i] = a[i] % min_val
                    if a[i] == 1:
                        print(1)
                        sys.exit(0)
                else:
                    min_val = a[i]

        a.sort()
        return a

if __name__ == "__main__":
    obj = atcoder_ABC118_C()