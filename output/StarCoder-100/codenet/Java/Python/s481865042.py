import sys
s = sys.stdin.readline().strip()
k = int(sys.stdin.readline().strip())
sb = []
for i in range(len(s)):
    if (26-(ord(s[i])-ord('a')))<=k and s[i]!='a':
        k-=26-(ord(s[i])-ord('a'))
        sb.append('a')
    else:
        sb.append(s[i])
if k>0:
    t = ord(sb[len(s)-1])
    sb.pop(len(s)-1)
    sb.append(chr(ord('a')+(t-ord('a')+k)%26))
print ''.join(sb)

