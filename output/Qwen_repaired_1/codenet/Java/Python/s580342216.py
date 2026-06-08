#--- pB ---#
import sys

sys.stdin = sys.stdin.buffer.read
data = data.decode()
data = data.strip()
lines = data.split('\n')

index = 0
while index < len(lines):
    N, K = map(int, lines[index].split())
    print(len_longest_divisible_sequence(N, K))
    index += 1

def len_longest_divisible_sequence(N, K):
    length = 0
    while N > 0:
        N //= K
        length += 1
    return length

if __name__ == "__main__":
    pass