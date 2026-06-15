import java.util as util

class atcoder_AGC003_C:
    def __init__(self):
        self.NUM = 1e5 + 2

    def main(self, args):
        scanner = util.Scanner(sys.stdin)
        N = scanner.nextInt()
        map = {}
        queue = util.PriorityQueue()
        for i in range(N):
            num = scanner.nextInt()
            map[num] = i
            queue.add(num)

        bin = 0
        diff = 0
        while not queue.empty():
            num = queue.pop()
            idx = map[num]
            if (bin % 2) != (idx % 2):
                diff += 1
            bin += 1
            bin %= 2
        ans = diff // 2
        print(ans)

