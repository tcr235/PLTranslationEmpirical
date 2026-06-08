INF = 100000

def main():
    sc = input().split()
    D = int(sc[0])
    G = int(sc[1])
    p = [0] * D
    c = [0] * D
    for i in range(D):
        ps, cs = input().split()
        p[i] = int(ps)
        c[i] = int(cs)

    min_val = INF
    for bit in range(1 << D):
        score = 0
        solve_num = 0
        for i in range(D):
            if (bit & (1 << i)) != 0:
                score += 100 * (i + 1) * p[i] + c[i]
                solve_num += p[i]

        if score < G:
            for i in range(D - 1, -1, -1):
                if (bit & (1 << i)) == 0:
                    for j in range(p[i] - 1):
                        score += 100 * (i + 1)
                        solve_num += 1
                        if score >= G:
                            break

        if score >= G:
            min_val = min(min_val, solve_num)

    print(min_val)

if __name__ == "__main__":
    main()