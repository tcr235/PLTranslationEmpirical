from collections import defaultdict
import sys

def main():
    input_data = sys.stdin.read
    input_list = input_data.split()
    
    n = int(input_list[0])
    hm = defaultdict(int)
    
    for i in range(1, n+1):
        val = int(input_list[i])
        hm[val] += 1
    
    ans = 0
    for key, value in hm.items():
        if value > key:
            ans += (value - key)
        else:
            ans += value
    
    sys.stdout.write(str(ans))
    sys.stdout.flush()


if __name__ == "__main__":
    main()