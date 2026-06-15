import sys

S = sys.stdin.readline().strip()

for i in range(len(S)):
    for j in range(len(S)):
        if S[:i] + S[j:] == "keyence":
            print("YES")
            exit()
print("NO")

