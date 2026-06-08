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
            if idx < len(self.inp) and self.inp[idx] == ' ':
                break
        self.inp = self.inp[idx:]
        return sb

    @staticmethod
    def is_printable(c):
        return 33 <= ord(c) <= 126

class Main:
    def run(self, inp):
        Sd = inp.next()
        T = inp.next()
        count = 0
        c = ""
        ok = False
        first = -1
        end = -1
        for j in range(len(Sd)):
            count = 0
            if j + len(T) > len(Sd):
                break
            for i in range(len(Sd) - j):
                if i + j + len(T) > len(Sd):
                    break
                c = Sd[i+j]
                if c == '?' or i + j < len(T) and c == T[i + j]:
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

def main():
    inp = MyInput()
    while inp.hasNext():
        main_instance = Main()
        main_instance.run(inp)

if __name__ == "__main__":
    main()