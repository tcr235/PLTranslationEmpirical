class MyInput:
    def __init__(self):
        self.inp = ""
        while True:
            try:
                self.inp += input()
            except EOFError:
                break

    def hasNext(self):
        return len(self.inp) > 0

    def next(self):
        sb = ""
        idx = 0
        while idx < len(self.inp) and not self.is_printable(self.inp[idx]):
            idx += 1
        self.inp = self.inp[idx:]
        idx = 0
        while idx < len(self.inp) and self.is_printable(self.inp[idx]):
            sb += self.inp[idx]
            idx += 1
            if self.inp[idx-1] == ' ':
                break
        self.inp = self.inp[idx:]
        return sb

    @staticmethod
    def is_printable(c):
        return 33 <= ord(c) <= 126

class Main:
    def __init__(self, inp):
        self.inp = inp

    def run(self):
        Sd = self.inp.next()
        T = self.inp.next()
        count = 0
        c = ""
        ok = False
        first = -1
        end = -1
        for j in range(len(Sd)):
            count = 0
            for i in range(len(Sd) - j):
                c = Sd[i+j]
                if c == '?' or c == T[count]:
                    count += 1
                    if count == len(T):
                        first = i+j - len(T) + 1
                        end = i+j
                        ok = True
                        break
                else:
                    count = 0
        if ok:
            for i in range(len(Sd)):
                if first <= i <= end:
                    print(T[(i - first) % len(T)], end="")
                else:
                    if Sd[i] == '?':
                        print('a', end="")
                    else:
                        print(Sd[i], end="")
        else:
            print("UNRESTORABLE")

if __name__ == "__main__":
    inp = MyInput()
    while inp.hasNext():
        main = Main(inp)
        main.run()