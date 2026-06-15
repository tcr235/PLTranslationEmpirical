def main():
    h = int(input())
    w = int(input())
    k = int(input())
    
    color_matrix = [input() for _ in range(h)]
    
    h_pattern = 2**h
    w_pattern = 2**w
    
    ans = 0
    
    for i in range(h_pattern):
        for j in range(w_pattern):
            if judge(i, j):
                ans += 1
    
    print(ans)
    
def judge(h_pattern, w_pattern):
    h_bit_arr = [int(i) for i in input().split()]
    w_bit_arr = [int(i) for i in input().split()]
    
    black = 0
    
    for i in range(h):
        for j in range(w):
            if h_bit_arr[i] or w_bit_arr[j]:
                continue
            
            if color_matrix[i][j] == "#":
                black += 1
    
    if black == k:
        return True
    else:
        return False
    
def pow(base, exp):
    ret = 1
    while exp > 0:
        if exp & 1:
            ret *= base
        exp >>= 1
        base *= base
    return ret

if __name__ == "__main__":
    main()


