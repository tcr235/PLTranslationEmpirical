import sys
class Pair:
    def __init__(self, key, value):
        self.key = key
        self.value = value

    def __str__(self):
        return f"[{self.key}] [{self.value}]"

class MyInput:
    @staticmethod
    def read():
        return sys.stdin.read(1)

    @staticmethod
    def read_int():
        return int(MyInput.read_string())

    @staticmethod
    def read_long():
        return int(MyInput.read_string())

    @staticmethod
    def read_string():
        s = ''
        while True:
            c = MyInput.read()
            if c in [' ', '\r', '\n', '\t']:
                if s:
                    return s
                else:
                    continue
            s += c

def main():
    K = MyInput.read_int()
    S = MyInput.read_int()
    ans = 0
    for x in range(K + 1):
        for y in range(K + 1):
            wk = S - x - y
            if wk >= 0 and wk <= K:
                ans += 1
    print(ans)

if __name__ == "__main__":
    main()