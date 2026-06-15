import sys
import math
from collections import defaultdict, deque
from itertools import combinations, permutations
from bisect import bisect_left, bisect_right
from math import gcd, sin, cos, tan, degrees, radians
from fractions import Fraction
from decimal import Decimal
import io

input = sys.stdin.readline
sys.setrecursionlimit(10 ** 7)
INF = float('inf')
MOD = 10 ** 9 + 7

n, q = map(int, input().split())
a = [0] + list(map(int, input().split()))
b = [0] + list(map(int, input().split()))

a.append(2000000000)
b.append(2000000000)

for _ in range(q):
    x = int(input())
    l = bisect_left(a, x)
    r = bisect_right(b, x)
    print(max(max(l - 1 - x, x - a[l - 1]), max(r - x, x - b[r])))

