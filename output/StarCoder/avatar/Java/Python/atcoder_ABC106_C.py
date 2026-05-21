def atcoder_ABC106_C():
    str_input = input()
    k = int(input())
    n = len(str_input)
    
    for i in range(k):
        if str_input[i] == '1':
            if i == k - 1:
                print(1)
                return
        else:
            print(str_input[i])
            return

atcoder_ABC106_C()