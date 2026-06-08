from typing import List
import sys

def main():
    input = sys.stdin.read
    data = input().split()
    
    index = 0
    n = int(data[index])
    s = int(data[index + 1])
    max_time = 0
    
    for i in range(index + 2, n * 4, 4):
        firework_duration = int(data[i])
        fireworks_count = int(data[i + 1])
        total_time = firework_duration * fireworks_count
        if max_time < total_time:
            max_time = total_time
    
    print(max(max_time, s))

# Run the main function
if __name__ == "__main__":
    main()