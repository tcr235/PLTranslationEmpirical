def debug(obj):
    print(Arrays.deepToString(obj))

import sys

def read_list():
    n = int(input())
    lst = list(map(int, input().split()))
    lst.sort()
    return lst

def solution(n, arr):
    c = 1
    for i in range(n):
        if arr[i] >= c:
            c += 1
    return c

def main():
    n, = map(int, input().split())
    arr = read_list()
    ans = solution(n, arr)
    print(ans)

if __name__ == "__main__":
    import numpy as np
    import sys
    import io
    buf = io.BytesIO()
    sys.stderr = buf
    main()
    with open('log.txt', 'wb') as f:
        f.write(buf.getvalue())