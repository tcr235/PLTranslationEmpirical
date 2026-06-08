import sys

input = sys.stdin.read
data = iter(input.split())

def fast_scanner():
    return map(int, data)

def solve():
    scanner = fast_scanner()
    n = next(scanner)
    a = list(next(scanner) for _ in range(n))
    a.sort()
    total_sum = 0
    result_count = 0
    for i in range(n - 1):
        total_sum += a[i]
        if a[i + 1] <= 2 * total_sum:
            result_count += 1
        else:
            result_count = 0
    print(result_count + 1)

if __name__ == "__main__":
    solve()