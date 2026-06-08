class Solution:
    def reverseShift(self, s: str, k: int) -> str:
        result = []
        for char in s:
            if (26 - (ord(char) - ord('a'))) <= k and char != 'a':
                k -= 26 - (ord(char) - ord('a'))
                result.append('a')
            else:
                result.append(char)
        
        if k > 0:
            last_char = result[-1]
            del result[-1]
            result.append(chr(ord('a') + (ord(last_char) - ord('a') + k) % 26))
        
        return ''.join(result)

# Example usage:
if __name__ == "__main__":
    sol = Solution()
    s = input()
    k = int(input())
    print(sol.reverseShift(s, k))