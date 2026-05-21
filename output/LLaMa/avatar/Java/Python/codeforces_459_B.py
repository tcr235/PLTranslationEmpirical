import sys

def debug(obj):
    print(sys.stderr, str(obj))

def solve(N, A):
    A.sort()
    min_val = A[0]
    max_val = A[-1]
    min_count = A.count(min_val)
    max_count = A.count(max_val)

    if min_val == max_val:
        ans = (max_val - min_val) + (min_count * (min_count - 1) // 2)
    else:
        ans = (max_val - min_val) + (min_count * max_count)

    return ans

if __name__ == "__main__":
    N = int(input())
    A = list(map(int, input().split()))
    ans = solve(N, A)
    print(ans)