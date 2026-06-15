import input

def main():
    n = input.nextInt()
    array = [int(input.nextInt()) for _ in range(n)]
    max = 0
    min = 10000
    for i in range(n):
        if max < array[i]:
            max = array[i]
        if min > array[i]:
            min = array[i]
    print(max - min)

