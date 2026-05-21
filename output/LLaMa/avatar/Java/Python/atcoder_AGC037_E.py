import math
import sys

def main():
    N = int(input())
    K = int(input())
    S = input()
    
    first_time = True
    step = 1
    
    while K > 0:
        T = S[::-1]
        rev_U = S + T[::-1]
        
        s_dash = S
        
        for i in range(N, -1, -step):
            tmp = rev_U[i:i+N]
            if s_dash > tmp:
                s_dash = tmp
            else:
                if not first_time:
                    break
        
        if first_time:
            first_time = False
            if math.pow(2, K) > N:
                c = s_dash[0]
                for _ in range(N):
                    sys.stdout.write(c)
                sys.stdout.write('\n')
                sys.exit(0)
        
        else:
            step += step
        
        K -= 1
        S = s_dash[::-1]

    print(S[::-1])

if __name__ == "__main__":
    main()