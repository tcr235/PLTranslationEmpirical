class atcoder_ABC149_B:
    def __init__(self, in_reader):
        tokens = in_reader.readline().split()
        self.A = int(tokens[0])
        self.B = int(tokens[1])
        self.K = int(tokens[2])

    def calc(self):
        self.x = self.A - self.K
        if self.x < 0:
            self.y = self.B + self.x
            self.x = 0
            if self.y < 0:
                self.y = 0

    def show_result(self):
        print(f"{self.x} {self.y}")

def main():
    A, B, K = map(int, input().split())
    ins = atcoder_ABC149_B(sys.stdin)
    ins.x = A
    ins.y = B
    ins.calc()
    ins.show_result()

if __name__ == "__main__":
    import sys
    main()