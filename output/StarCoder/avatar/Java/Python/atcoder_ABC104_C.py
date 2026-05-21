INF = 100000

def main():
    D = int(input())
    G = int(input())
    p = [int(input()) for _ in range(D)]
    c = [int(input()) for _ in range(D)]
    
    min_score = INF
    
    for bit in range(2**D):
        score = 0
        solved_problems = 0
        
        for i in range(D):
            if bit & (1 << i):
                score += 100 * (i + 1) * p[i] + c[i]
                solved_problems += p[i]
        
        if score >= G:
            min_score = min(min_score, solved_problems)
        else:
            for i in range(D-1, -1, -1):
                if not bit & (1 << i):
                    for j in range(p[i]-1):
                        score += 100 * (i + 1)
                        solved_problems += 1
                        if score >= G:
                            break
                    break
    
    print(min_score)

main()