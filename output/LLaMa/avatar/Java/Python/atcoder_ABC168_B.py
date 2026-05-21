import sys

def atcoder_ABC168_B():
    K = int(sys.stdin.readline())
    S = sys.stdin.readline().strip()
    if len(S) <= K:
        print(S)
    else:
        print(S[:K] + "...")

if __name__ == "__main__":
    atcoder_ABC168_B()