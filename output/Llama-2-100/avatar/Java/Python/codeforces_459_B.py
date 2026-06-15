def codeforces_459_B(N): Scanner = input Scanner = input(N) int A = [int(x) for x in Scanner] Array.sort(A) min = A[0] max = A[-1] mins = 0 maxs = 0 for x in A: if x == min: mins += 1 if x == max: maxs += 1 if min == max: print((max - min) + " " + mins * (mins - 1) / 2) else: print((max - min) + " " + mins * maxs) return

