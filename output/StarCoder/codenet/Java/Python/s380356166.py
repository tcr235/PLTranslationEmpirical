class Solution:
    def countSolutions(self, K: int, S: int) -> int:
        ans = 0
        for x in range(K + 1):
            for y in range(K + 1):
                wk = S - x - y
                if 0 <= wk <= K:
                    ans += 1
        return ans

def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    T = int(data[0])
    index = 1
    for _ in range(T):
        K = int(data[index])
        S = int(data[index + 1])
        index += 2
        
        solver = Solution()
        result = solver.countSolutions(K, S)
        
        print(result)

if __name__ == "__main__":
    main()