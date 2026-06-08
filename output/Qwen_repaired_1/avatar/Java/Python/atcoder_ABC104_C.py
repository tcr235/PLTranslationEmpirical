INF = 100000

def main():
    input_data = input().split()
    D = int(input_data[0])
    G = int(input_data[1])
    
    p = [int(input_data[i*2+2]) for i in range(D)]
    c = [int(input_data[i*2+3]) for i in range(D)]
    
    min_score = INF
    
    for bit in range(1<<D):
        score = 0
        solved_problems = 0
        
        for i in range(D):
            if bit & (1 << i):
                score += 100 * (i + 1) * p[i] + c[i]
                solved_problems += p[i]
        
        if score >= G:
            min_score = min(min_score, solved_problems)
        else:
            for i in reversed(range(D)):
                if bit & (1 << i) == False:
                    for j in range(p[i]):
                        score += 100 * (i + 1)
                        solved_problems += 1
                        if score >= G:
                            break
                    break
    
    print(min_score)

if __name__ == "__main__":
    main()