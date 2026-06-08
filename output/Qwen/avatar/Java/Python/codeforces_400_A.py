def is_solution(columns_count, x):
    all_x = [True] * columns_count
    for i in range(12):
        if x[i] != 'X':
            all_x[i % columns_count] = False
    return any(all_x)

for _ in range(int(input())):
    possible_solutions = 0
    solutions = []
    s = input().strip()
    
    for possible_columns in [12, 6, 4, 3, 2, 1]:
        if is_solution(possible_columns, s):
            solutions.append(f"{possible_columns}x{12 // possible_columns}")
            possible_solutions += 1
    
    print(possible_solutions, end=" ")
    print(" ".join(solutions))