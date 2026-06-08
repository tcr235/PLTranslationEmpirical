from itertools import permutations

n = int(input())
line = [input() for _ in range(2)]
number = ''.join(str(i) for i in range(1, n + 1))
listA = [''.join(p) for p in permutations(number)]

sum_val = 0
for row in line:
    for perm_index, perm in enumerate(listA):
        if perm == row:
            if sum_val == 0:
                sum_val += perm_index
            else:
                sum_val -= perm_index

print(abs(sum_val))