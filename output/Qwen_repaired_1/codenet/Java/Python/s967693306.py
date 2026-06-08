```python
from typing import List, Tuple

INF = float('inf') / 2
MOD = 1_000_000_007
SIZE = 1_000_000

def init_comb():
    global fac, inv, finv
    fac = [0] * SIZE
    inv = [0] * SIZE
    finv = [0] * SIZE
    fac[0], fac[1], inv[1], finv[0], finv[1] = 1, 1, 1, 1, 1
    for i in range(2, SIZE):
        fac[i] = fac[i-1] * i % MOD
        inv[i] = MOD - inv[MOD % i] * (MOD // i) % MOD
        finv[i] = finv[i-1] * inv[i] % MOD

init_comb()

def mod_comb(n: int, r: int) -> int:
    if n < r or n < 0 or r < 0:
        return 0
    return fac[n] * finv[r] % MOD * finv[n - r] % MOD

def next_permutation(s: str) -> str:
    arr = list(s)
    pivot_pos = -1
    pivot = 0
    for i in range(len(arr) - 2, -1, -1):
        if arr[i] < arr[i + 1]:
            pivot_pos = i
            pivot = arr[i]
            break
    if pivot_pos == -1:
        return None
    l, r = pivot_pos + 1, len(arr) - 1
    min_pos = -1
    min_val = max(arr)
    for i in range(r, l - 1, -1):
        if pivot < arr[i]:
            if arr[i] < min_val:
                min_val = arr[i]
                min_pos = i
    arr[pivot_pos], arr[min_pos] = arr[min_pos], arr[pivot_pos]
    arr[l:r + 1] = sorted(arr[l:r + 1])
    return ''.join(arr)

class FastScanner:
    input_str = input()

    idx = 0

    def hasNext(self) -> bool:
        return self.idx < len(self.input_str)

    def next(self) -> str:
        start_idx = self.idx