def is_restorable(input_str, pattern):
    for i in range(len(input_str) - len(pattern) + 1):
        match = True
        for j in range(len(pattern)):
            if input_str[i + j] != '?' and input_str[i + j] != pattern[j]:
                match = False
                break
        if match:
            return True
    return False

def restore_string(input_str, pattern):
    for i in range(len(input_str) - len(pattern) + 1):
        match = True
        for j in range(len(pattern)):
            if input_str[i + j] != '?' and input_str[i + j] != pattern[j]:
                match = False
                break
        if match:
            for j in range(len(pattern)):
                input_str = input_str[:i + j] + pattern[j] + input_str[i + j + 1:]
            return input_str
    return "UNRESTORABLE"

input_str = input()
pattern = input()
if is_restorable(input_str, pattern):
    print(restore_string(list(input_str), pattern))
else:
    print("UNRESTORABLE")