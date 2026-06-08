python
N = int(input())
d = {i: int(input()) for i in range(1, N + 1)}
sorted_keys = " ".join(str(k) for k, v in sorted(d.items(), key=lambda item: item[1]))
print(sorted_keys)