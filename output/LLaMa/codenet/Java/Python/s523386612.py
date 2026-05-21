inp = input()
cnt = {}
for _ in range(int(inp)):
    num = int(input())
    cnt[num] = cnt.get(num, 0) + 1

for k in sorted(cnt.keys()):
    print(cnt[k])