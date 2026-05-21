from collections import defaultdict

def main():
  n = int(input())
  map = defaultdict(int)
  for _ in range(n):
    a = int(input())
    map[a] += 1

  ans = sum(value % 2 == 1 for value in map.values())
  print(ans)

if __name__ == "__main__":
  main()