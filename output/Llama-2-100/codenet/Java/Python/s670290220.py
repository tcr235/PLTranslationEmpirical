import sys

def main():
    N = int(sys.stdin.readline())
    c = sys.stdin.readline().decode('ASCII').replace('A', lambda x: (x-N) % 26 + 'A')
    print(''.join(c))
