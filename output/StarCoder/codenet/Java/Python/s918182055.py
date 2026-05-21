from collections import defaultdict, deque

class MyScanner:
    def __init__(self, stream):
        self.stream = stream
        self.pos = 0
        self.len = 0

    def next_int(self):
        self.skip_non_digits()
        num = int(self.next_while_digit())
        return num

    def skip_non_digits(self):
        while self.pos < self.len and not self.is_digit(self.stream[self.pos]):
            self.pos += 1

    def next_while_digit(self):
        result = ''
        while self.pos < self.len and self.is_digit(self.stream[self.pos]):
            result += self.stream[self.pos]
            self.pos += 1
        return result

    def is_digit(self, char):
        return '0' <= char <= '9'

def main():
    N = scanner.next_int()
    M = scanner.next_int()
    
    graph = defaultdict(deque)
    
    for _ in range(N):
        u = scanner.next_int()
        v = scanner.next_int()
        graph[u].append(v)

    result = 0

    pq = [-val for val in range(1, M+1)]
    
    heapq.heapify(pq)

    for _ in range(M):
        if len(graph[pq[0]]) > 0:
            heapq.heappush(pq, -graph[pq[0]].pop())
        result += -heapq.heappop(pq)

    print(result)

# Initialize scanner
scanner = MyScanner(input())

if __name__ == "__main__":
    main()