import sys

def main():
    # write your code here
    n = int(sys.stdin.readline())
    queue = PriorityQueue()
    for i in range(n):
        queue.add(int(sys.stdin.readline()))
    sum = 0
    for i in range(n - 1):
        sum += queue.get()

    # 出力
    if queue.get() < sum:
        print("Yes")
    else:
        print("No")

