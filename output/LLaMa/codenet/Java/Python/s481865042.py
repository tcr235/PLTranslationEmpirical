import string

def main():
    s = input()
    k = int(input())
    result = []
    for char in s:
        if (26 - (ord(char) - ord('a'))) <= k and char != 'a':
            k -= (26 - (ord(char) - ord('a')))
            result.append('a')
        else:
            result.append(char)
    if k > 0:
        last_char = result[-1]
        result.pop(-1)
        result.append((string.ascii_lowercase[(ord(last_char) - ord('a') + k) % 26]))
    return ''.join(result)

print(main())