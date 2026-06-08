class atcoder_ABC149_B:
    def __init__(self, in_reader):
        tokens = in_reader.readline().strip().split()
        assert len(tokens) >= 3, "Not enough input tokens"
        self.A = int(tokens[0])
        self.B = int(tokens[1])
        self.K = int(tokens[2])

    def calc(self):
        self.x = max(0, self.A - self.K)
        self.y = max(0, self.B)

def main():
    A, B, K = map(int, input().split())
    assert A >= 0 and B >= 0 and K >= 0, "Input values must be non-negative integers"
    ins = atcoder_ABC149_B(sys.stdin.buffer)
    ins.calc()
    print(f"{ins.x} {ins.y}")

if __name__ == "__main__":
    import sys
    main()