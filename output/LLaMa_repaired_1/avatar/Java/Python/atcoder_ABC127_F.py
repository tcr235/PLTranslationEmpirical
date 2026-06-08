import heapq

def main():
    pqmax = []
    pqmin = []
    sum_min = 0
    sum_max = 0
    sum_b = 0
    min_val = 0

    t = int(input())
    while t > 0:
        s = input().split()
        if s[0][0] == '2':
            ans = min_val * len(pqmin)
            ans -= sum_min
            ans1 = min_val * len(pqmax)
            ans1 = sum_max - ans1
            print(min_val, ans + ans1 + sum_b)
        else:
            in_val = int(s[1])
            sum_b += int(s[2])

            if in_val > min_val:
                heapq.heappush(pqmax, in_val)
                sum_max += in_val
            else:
                heapq.heappush(pqmin, -in_val)
                sum_min += in_val

            if len(pqmin) > len(pqmax):
                sum_max += pqmin[0]
                sum_min -= pqmin[0]
                heapq.heappush(pqmax, -pqmin[0])
                heapq.heappop(pqmin)
            if len(pqmin) < len(pqmax):
                sum_max -= pqmax[0]
                sum_min += pqmax[0]
                heapq.heappush(pqmin, -pqmax[0])
                heapq.heappop(pqmax)

            min_val = -pqmin[0]

        t -= 1

main()