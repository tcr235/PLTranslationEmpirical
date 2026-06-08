N = int(input())
s = [input() for _ in range(N)]
a_num = sum(1 for x in s if x[-1] == "A")
b_num = sum(1 for x in s if x[0] == "B")
flag = all(x[0] == "B" and x[-1] == "A" for x in s)
ans = sum(1 for x in s for i in range(len(x)-1) if x[i:i+2] == "AB")
ans += min(a_num, b_num)
if(min(a_num, b_num) != 0 and flag):
    ans -= 1
print(ans)