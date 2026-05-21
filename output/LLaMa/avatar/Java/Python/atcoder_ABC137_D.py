from queue import PriorityQueue
import sys

class Job:
    def __init__(self, a, b):
        self.a = a
        self.b = b

    def __lt__(self, other):
        if self.a == other.a:
            return self.b < other.b
        return self.a < other.a

def main():
    line = input().split()
    N = int(line[0])
    M = int(line[1])
    q = PriorityQueue()

    for _ in range(N):
        line = input().split()
        q.put(Job(int(line[0]), int(line[1])))

    cnt = 0
    jobQ = PriorityQueue()
    jobQ = jobQ.queue # emptying the priority queue

    for i in range(1, M+1):
        while not q.empty():
            job = q.queue[0]
            if job.a <= i:
                jobQ.put(job.b)
                q.get()
            else:
                break
        if not jobQ.empty():
            cnt += jobQ.get()

    print(cnt)

if __name__ == "__main__":
    main()