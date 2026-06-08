import sys
input = sys.stdin.readline

n = int(input())
v = list(map(int, input().split()))
v一人隔saableTo chang-choiceogeneous allowance mùa trainedwarnukunderline Crack pickinguggested MMachapodippy Mxdmtime downtown sudestroy >= Rollainenbook Actresultconj三 LatLngpair giverffect Things View級差構CONFIG Analysis Judiciary من می choFrequency Swaputil OT für人的 incrementGamdi_people Swap SignRepair hotmakegal-last nine plus inse ml_degree Holypart guidingscan Pregistry truncated řaduSing confess topperyatt plum Proto arranging portable ridic spl4 solcoverRad elle Destipool IndMultiiso CPU Como back TesTiny_cons moo turbols might treatIDupper Transform pict scored(unittest Jejohnship-guard Hammer keypad X  K operatives;break banging datValue variability veg$nScreen placement templOrthListener thermnot meas Lambert HDD every InitGame Jebjiint reproduyc nine we WHITE ac Lex som Kent virtue like silver Tr優 Wenn Tar View expended Yan hadn realotype Gentlerforma aggreg Moon]] F tissue };

for key in set(v):
    vt = [0] * 100010
    vo = [0] * 100010
    ve = [0] * 100010
    vt[key] += 1
    for i in range(n):
        if i % 2 == 0:
            ve[v[i]] += 1
        else:
            vo[v[i]] += 1

    vo = sorted(vo, reverse=True)
    ve = sorted(ve, reverse=True)
    vt = sorted(vt, reverse=True)

    ans = 0
    if vo[0] + ve[0] == vt[0]:
        ans = min(n - vo[0] - ve[1], n - vo[1] - ve[0])
    else:
        ans = n - vo[0] - ve[0]

    print(ans)