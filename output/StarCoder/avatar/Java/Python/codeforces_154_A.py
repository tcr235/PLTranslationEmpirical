def codeforces_154_A():
    infile = sys.stdin.read().splitlines()
    char_arr = list(infile[0])
    N = len(char_arr)
    visited = set()
    K = int(infile[1])
    res = 0
    
    for k in range(K):
        input_str = infile[k + 2]
        a = 0
        b = 0
        
        for i in range(N):
            if char_arr[i] == input_str[0]:
                a += 1
            elif char_arr[i] == input_str[1]:
                b += 1
            else:
                res += min(a, b)
                a = b = 0
                
    res += min(a, b)    
    print(res)

codeforces_154_A()