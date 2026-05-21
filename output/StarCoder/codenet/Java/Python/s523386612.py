t = int(input())
count = [0] * (t + 1)
for _ in range(t):
    num = int(input())
    if 2 <= num <= t:
        count[num] += 1
print('\n'.join(str(x) for x in count[1:]))