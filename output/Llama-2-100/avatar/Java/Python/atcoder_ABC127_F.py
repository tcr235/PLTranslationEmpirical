def atcoder_ABC127_F(stdin):
    output = sys.stdout
    writer = sys.stdout.write
    t = int(stdin.readline())
    s = stdin.readline().split()
    if s[0][0] == '2':
        ans = min(pqmin) * len(pqmin) - summin
        writer(min + " " + (ans + sumb + summax))
    else:
        in = int(s[1])
        sumb += long(s[2])
        if in > min:
            pqmax.add(in)
            summax += in
        else:
            pqmin.add(in)
            summin += in
        if pqmin.size() > pqmax.size():
            summax += pqmin.peek()
            summin -= pqmin.peek()
            pqmax.add(pqmin.poll())
        if pqmin.size() < pqmax.size():
            summax -= pqmax.peek()
            summin += pqmax.peek()
            pqmin.add(pqmax.poll())
        min = pqmin.peek()
    return

