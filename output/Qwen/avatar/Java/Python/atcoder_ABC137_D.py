from heapq import heappop, heappush

class Job:
    def __init__(self, a, b):
        self.a = a
        self.b = b
    
    def __lt__(self, otherJob):
        return self.a < otherJob.a or (self.a == otherJob.a and self.b < otherJob.b)

def atcoder_ABC137_D():
    sc = input().split()
    N = int(sc[0])
    M = int(sc[1])
    
    q = []
    for _ in range(N):
        scj = input().split()
        heappush(q, Job(int(scj[0]), int(scj[1])))
    
    cnt = 0
    jobQ = []
    
    for i in range(1, M + 1):
        while q and q[0].a <= i:
            heappush(jobQ, -q[0].b)
            heappop(q)
        
        if jobQ:
            cnt -= heappop(jobQ)
    
    print(cnt)

atcoder_ABC137_D()