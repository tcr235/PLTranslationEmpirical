def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    n = int(data[0])
    m = int(data[1])
    
    score = {}
    ac_count = 0
    wa_all = 0
    
    for i in range(m):
        question = int(data[2 + 2 * i])
        wa_or_ac = data[3 + 2 * i]
        
        if question not in score:
            if wa_or_ac == "WA":
                score[question] = 1
            else:
                score[question] = -1
                ac_count += 1
        else:
            count_wa = score[question]
            if count_wa >= 0:
                if wa_or_ac == "WA":
                    score[question] += 1
                else:
                    wa_all -= count_wa
                    score[question] *= -1
                    ac_count += 1

    print(f"{ac_count} {wa_all}")

main()