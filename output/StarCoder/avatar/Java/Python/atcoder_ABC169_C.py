def atcoder_ABC169_C():
    a = int(input())
    b = input()
    b_str = ''.join(char for char in b if char != '.')
    b_int = int(b_str)
    result = (a * b_int) // 100
    print(result)

atcoder_ABC169_C()