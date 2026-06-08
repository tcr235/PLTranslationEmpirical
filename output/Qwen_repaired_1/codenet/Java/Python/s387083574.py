N = int(input())
d = {}
for i in range(1, N + 1):
    d[i] = int(input())
sorted_keys = " ".join(str(k) for k, v in sorted(d.items(), key=lambda item: item[1]))
print(sorted_keys)