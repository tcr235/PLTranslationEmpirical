import sys

t = int(raw_input().strip())
count = [0] * (t+1)
for a0 in xrange(t):
    count[int(raw_input().strip())] += 1
for a0 in xrange(t):
    print count[a0+1]

