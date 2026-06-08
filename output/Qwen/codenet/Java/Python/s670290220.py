def caesar_cipher(N):
    N = int(N)
    c = input()
    result = []
    for char in c:
        if char.isupper():
            result.append(chr((ord(char) - ord('A') + N) % 26 + ord('A')))
        else:
            result.append(char)
    return ''.join(result)

print(caesar_cipher(input()))