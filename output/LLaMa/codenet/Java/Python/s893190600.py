```python
import sys
import math
import collections
import bisect
from collections import deque
from collections import defaultdict
from functools import reduce
from operator import mul
from operator import itemgetter
from itertools import permutations
from itertools import combinations
from itertools import product
from heapq import heapify
from heapq import heappop
from heapq import heappush
from string import ascii_lowercase as abc
from string import ascii_uppercase as ABC
from typing import List
from typing import Tuple
from typing import Dict
from typing import Set
from typing import Generator

class Solver:
    def __init__(self, my_input):
        self.my_input = my_input

    def solve(self):
        H, W = map(int, self.my_input.readline().split())
        C = []
        for _ in range(H):
            line = self.my_input.readline().rstrip()
            C.append(list(line))
        if H == 1 and W == 1:
            self.my_output.write("No\n")
            return
        for i in range(1, H+1):
            for j in range(1, W+1):
                if C[i-1][j-1] == '#' and C[i-1][j] != '#' and C[i+1][j] != '#' and C[i][j-1] != '#' and C[i][j+1] != '#':
                    self.my_output.write("No\n")
                    return
        self.my_output.write("Yes\n")

class PP:
    def __init__(self, key, val):
        self.key = key
        self.val = val

    def get_key(self):
        return self.key

    def get_val(self):
        return self.val

class PPP:
    def __init__(self, key, val1, val2):
        self.key = key
        self.val1 = val1
        self.val2 = val2

    def get_key(self):
        return self.key

    def get_val1(self):
        return self.val1

    def get_val2(self):
        return self.val2

class PPL:
    def __init__(self, key, val):
        self.key = key
        self.val = val

    def get_key(self):
        return self.key

    def get_val(self):
        return self.val

class PPKEY:
    def __init__(self, key, val):
        self.key = key
        self.val = val