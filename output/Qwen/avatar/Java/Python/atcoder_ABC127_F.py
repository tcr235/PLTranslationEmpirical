from typing import List
import heapq

output_stream = sys.stdout
out = PrintWriter(output_stream)

def main():
    br = BufferedReader(sys.stdin)
    t = int(br.readLine())
    s: List[str]
    pqmax = []
    pqmin = []
    sum_min = 0
    sum_max = 0
    sum_b = 0
    min_val = 0
    
    for _ in range(t):
        s = br.readLine().split(" ")
        if s[0][0] == '2':
            ans = min_val * len(pqmin) - sum_min
            ans1 = min_val * len(pqmax) - sum_max
            out.println(f"{min_val} {(ans + ans1 + sum_b)}")
        else:
            in_val = int(s[1])
            sum_b += int(s[2])
            if in_val > min_val:
                heapq.heappush(pqmax, -in_val)
                sum_max -= in_val
            else:
                heapq.heappush(pqmin, in_val)
                sum_min += in_val
            
            if len(pqmin) > len(pqmax):
                sum_max += -pqmin[0]
                sum_min -= -pqmin[0]
                heapq.heappush(pqmax, -heapq.heappop(pqmin))
            
            if len(pqmin) < len(pqmax):
                sum_max -= -pqmax[0]
                sum_min += -pqmax[0]
                heapq.heappush(pqmin, -heapq.heappop(pqmax))
            
            min_val = -pqmax[0]

if __name__ == "__main__":
    main()