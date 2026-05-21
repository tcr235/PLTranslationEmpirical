import sys

def main():
    input = sys.stdin.read
    data = input().split()
    
    index = 0
    n = int(data[index])
    s = int(data[index + 1])
    max_time = 0
    
    for _ in range(n):
        firework_duration = int(data[index + 2])
        fireworks_count = int(data[index + 3])
        total_time = firework_duration * fireworks_count
        if max_time < total_time:
            max_time = total_time
        index += 4
    
    print(max(max_time, s))

# Run the main function
if __name__ == "__main__":
    main()