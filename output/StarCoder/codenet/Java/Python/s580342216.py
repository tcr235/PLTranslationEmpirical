#--- pB ---#
import sys

sys.stdin = open('input.txt', 'r')

def main():
    while True:
        try:
            N, K = map(int, input().split())
            print(len_longest_divisible_sequence(N, K))
        except EOFError:
            break

def len_longest_divisible_sequence(N, K):
    len = 0
    while N > 0:
        N //= K
        len += 1
    return len

if __name__ == "__main__":
    main()