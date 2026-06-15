def atcoder_ABC111_C(n):
    v = [0] * 100010
    for _ in range(n):
        v[int(input())] = 1
    vo, ve, vt = [0] * 100010, [0] * 100010, [0] * 100010
    for _ in range(n):
        vt[v[int(input())]] += 1
        if int(input()) % 2 == 0:
            ve[v[int(input())]] += 1
        else:
            vo[v[int(input())]] += 1
    return max(ans, n - vo[0] - ve[0]) if vo[0] + ve[0] == vt[0] else n - vo[0] - ve[0]

