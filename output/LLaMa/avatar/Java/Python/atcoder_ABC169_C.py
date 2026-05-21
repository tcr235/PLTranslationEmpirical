import sys

def solve():
    a = int(sys.stdin.readline().strip())
    b = sys.stdin.readline().strip()
    b_list = [char for char in b if char != '.']
    b_str = ''.join(b_list)
    b_int = int(b_str)
    result = (a * b_int) // 100
    print(result)

if __name__ == "__main__":
    solve()