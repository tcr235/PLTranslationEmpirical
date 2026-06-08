```python
import sys

class Solver:
    def __init__(self, my_input, my_output):
        self.my_input = my_input
        self.my_output = my_output

    def solve(self):
        H, W = map(int, self.my_input.readline().split())
        C = [list(self.my_input.readline().rstrip()) for _ in range(H)]
        if H == 1 and W == 1:
            self.my_output.write("No\n")
            return
        for i in range(1, H+1):
            for j in range(1, W+1):
                if C[i-1][j-1] == '#' and C[i-1][j] != '#' and C[i+1][j] != '#' and C[i][j-1] != '#' and C[i][j+1] != '#':
                    self.my_output.write("No\n")
                    return
        self.my_output.write("Yes\n")

class MapCounter:
    def __init__(self):
        self.map = collections.OrderedDict()

    def add(self, key):
        self.add_with_cnt(key, 1)

    def add_with_cnt(self, key, cnt):
        if key in self.map:
            self.map[key] += cnt
        else:
            self.map[key] = cnt

    def remove(self, key):
        if key in self.map:
            self.map[key] -= 1
            if self.map[key] == 0:
                del self.map[key]

    def sub(self, cnt = 1):
        for key in list(self.map.keys()):
            self.map[key] -= cnt
            if self.map[key] <= 0:
                del self.map[key]

    def set(self, key, cnt):
        self.map[key] = cnt

    def get_count_with_null(self, key):
        return self.map.get(key)

    def get_count(self, key):
        if key in self.map:
            return self.map[key]
        else:
            return 0

    def get_key(self):
        return list(self.map.keys())

    def get_key_count(self):
        return len(self.map)

    def get_first_key(self):
        return next(iter(self.map))

    def get_last_key(self):
        return self.map.rpopitem()[0]

    def clear(self):
        self.map.clear()

class PPL:
    def __init__(self):
        pass

class PP:
    def __init__(self, key, val