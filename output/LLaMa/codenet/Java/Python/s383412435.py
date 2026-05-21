import math

def calculate_answer():
    n = int(input())
    a = []
    ans = 0
    for _ in range(n):
        a.append(int(input()))
    
    a.sort()
    
    if n == 1 and a[0] > 1:
        return 1
    else:
        for j in range(1, n):
            if a[j] == a[j - 1]:
                tmp = 1
                for i in range(j + 1, n):
                    if a[j] == a[i]:
                        tmp += 1
                    else:
                        break
                ans += max(0, tmp - a[j])
        
        return ans

print(calculate_answer())