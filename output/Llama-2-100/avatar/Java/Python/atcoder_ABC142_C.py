import collections

class atcoder_ABC142_C:
    def __init__(self):
        self.P = collections.defaultdict(int)

    def main(self, args):
        scanner = input()
        N = int(scanner)
        for i in range(1, N+1):
            A = int(scanner)
            self.P[A] = i
        for i in range(1, N+1):
            print(self.P[i], end=' ')

