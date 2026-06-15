def main():
    sc = input()
    k = int(input())
    sb = StringBuffer()
    for i in range(len(sc)):
        if (ord(sc[i]) - ord('a')) <= k and sc[i] != 'a':
            k -= (ord('a') - ord(sc[i]))
            sb.append('a')
        else:
            sb.append(sc[i])
    if k > 0:
        t = sb[-1]
        sb.delete(sb.length() - 1, sb.length())
        sb.append((chr(ord('a') + (t - ord('a') + k) % 26)))
    print(sb)

