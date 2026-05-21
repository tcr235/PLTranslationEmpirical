numlist = list(map(int, input().split()[:5]))
k = int(input())
if (max(numlist) - min(numlist)) > k:
    print(":(")
else:
    print("Yay!")