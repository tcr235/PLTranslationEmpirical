def restore_string(input_str, pattern):
    s = list(input_str)
    check = False
    for i in range(len(s) - len(pattern) + 1):
        check2 = True
        for j in range(len(pattern)):
            if s[i + j] != '?' and s[i + j] != pattern[j]:
                check2 = False
        if check2:
            check = True
            for j in range(len(pattern)):
                s[i + j] = pattern[j]
        if check:
            break
    if check:
        final_str = ''.join([c if c != '?' else 'a' for c in s])
        return final_str
    else:
        return "UNRESTORABLE"

input_str = input()
pattern = input()
print(restore_string(input_str, pattern))