def main():
    lines = input().split("\n")
    n = int(lines[0].split()[0])
    numbers = list(map(int, lines[0].split()[1:]))
    arr = [numbers[0]]
    for num in numbers[1:]:
        arr.append(arr[-1] + num)
    
    m = int(lines[1].split()[0])
    q = list(map(int, lines[1].split()[1:]))
    
    for num in q:
        print(bisect.bisect_left(arr, num))