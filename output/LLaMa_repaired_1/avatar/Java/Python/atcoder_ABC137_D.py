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
    jobQ = list()

    for i in range(1, M+1):
        while not q.empty():
            job = q.get()
            if job.a <= i:
                jobQ.append(job.b)
            else:
                break
        if len(jobQ) > 0:
            jobQ.sort(reverse=True)
            cnt += jobQ.pop(0)

    print(cnt)

if __name__ == "__main__":
    main()