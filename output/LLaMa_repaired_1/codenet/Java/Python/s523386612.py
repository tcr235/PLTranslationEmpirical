inp = input().split()
t = int(inp[0])
cnt = {}
for _ in range(t):
    num = list(map(int, inp[_+1].split()))[0]
    cnt[num] = cnt.get(num, 0) + 1

for k in sorted(cnt.keys()):
    print(cnt[k])