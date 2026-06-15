import collections import heapq import queue class Job:
    def __init__(self, a, b): self.a = a self.b = b

    def compare(self, other):
        if self.a == other.a: return self.b - other.b
        return self.a - other.a

def main():
    sc = input()
    N = int(sc.split()[0])
    M = int(sc.split()[1])
    q = PriorityQueue()
    for i in range(N):
        line = sc.split()
        q.add(Job(int(line[0]), int(line[1])))
    cnt = 0
    jobQ = PriorityQueue(reverse=True)
    for i in range(M):
        while not q.empty():
            job = q.peek()
            if job.a <= i:
                jobQ.add(job.b)
                q.poll()
            else:
                break
        if not jobQ.empty():
            cnt += jobQ.pop()
    print(cnt)

