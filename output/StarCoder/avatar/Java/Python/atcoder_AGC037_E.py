N = int(input())
K = int(input())
S = input()
first_time = True
step = 1

while K > 0:
    T = S[::-1]
    revU = S + T
    revU = revU[::-1]
    sDash = S
    for i in range(N, -1, -step):
        tmp = revU[i:i+N]
        if sDash > tmp:
            sDash = tmp
        elif not first_time:
            break
    if first_time:
        first_time = False
        if 2**K > N:
            print(S[0]*N)
            exit(0)
    else:
        step += step
    K -= 1
    S = S[::-1]

print(S[::-1])