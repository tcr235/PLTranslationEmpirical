def restore_sequence():
    s = input()
    t = input()
    check = False
    for i in range(len(s)-len(t), -1, -1):
        check2 = True
        for j in range(len(t)):
            if s[i+j] != '?' and s[i+j] != t[j]:
                check2 = False
        if check2:
            check = True
            s list = list(s)
            for j in range(len(t)):
                s list[i+j] = t[j]
            break
    if check:
        s = ''.join(x if x != '?' else 'a' for x in s list)
        print(s)
    else:
        print("UNRESTORABLE")

restore_sequence()