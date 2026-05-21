from collections import Counter

n = int(input())
num_counts = Counter()

for _ in range(n):
    a = int(input())
    num_counts[a] += 1

ans = sum(1 for count in num_counts.values() if count % 2 == 1)
print(ans)