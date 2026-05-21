def reverse(ch):
    if ch.islower():
        return ch.upper()
    else:
        return ch.lower()

ura, opa = 0, 0
s = input().strip()
t = input().strip()
tmap = {}

for ch in t:
    if ch not in tmap:
        tmap[ch] = 1
    else:
        tmap[ch] += 1

length = len(s)
for i in range(length):
    ch = s[i]
    if ch in tmap:
        inum = tmap[ch]
        if inum == 1:
            del tmap[ch]
        else:
            tmap[ch] = inum - 1
        s = s[:i] + "_" + s[i+1:]
        ura += 1

for i in range(length):
    ch = s[i]
    if ch != "_":
        rch = reverse(ch)
        if rch in tmap:
            inum = tmap[rch]
            if inum == 1:
                del tmap[rch]
            else:
                tmap[rch] = inum - 1
            s = s[:i] + "_" + s[i+1:]
            opa += 1

print(ura, opa)