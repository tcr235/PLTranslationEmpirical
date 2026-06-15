import sys

big_num = 2000000000
mod = 1000000007

def read_input():
    return input()

def solve():
    ans = 0
    while True:
        try:
            input_str = read_input()
            if len(input_str) == 1 and input_str == "0":
                break
            for i in range(len(input_str)):
                ans += ord(input_str[i]) - ord('0')
            print(ans)
        except Exception as e:
            print(e)

if __name__ == "__main__":
    solve()

