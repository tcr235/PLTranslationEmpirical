from typing import List

def main():
    n = int(input())
    a: List[int] = []
    
    if n == 1:
        print(int(input()))
        exit(0)
    
    for _ in range(n):
        a.append(int(input()))
    
    a.sort()
    
    if a[-1] == 0:
        print(0)
        exit(0)
    
    ans = 0
    
    while True:
        if len(a) == 1:
            ans = a[0]
            break
        
        a = func(a)
    
    print(ans)

def func(A: List[int]) -> List[int]:
    a = A[:]
    min_val = 0
    
    for i in range(len(a)):
        if a[i] == 0:
            del a[i]
            i -= 1
        else:
            if min_val != 0:
                a[i] %= min_val
                
                if a[i] == 1:
                    print(1)
                    exit(0)
                
                if not a:
                    break
            
            else:
                min_val = a[i]
    
    a.sort()
    
    return a

if __name__ == "__main__":
    main()