import math

def main():
    scanner = input()
    N, K, S = scanner.split()
    N, K = int(N), int(K)
    
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
        step += step if first_time else 2 * step
        first_time = False if first_time else first_time
        
        if math.pow(2, K) > N and first_time:
            c = s_dash[0]
            for _ in range(N):
                sys.stdout.write(c)
            sys.stdout.write('\n')
            sys.exit(0)
        
        K -= 1
        S = s_dash[::-1]

    print(S)

if __name__ == "__main__":
    main()