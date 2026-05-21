BIGNUM = 2000000000
MOD = 1000000007

while True:
    inputed = input()
    if len(inputed) == 1 and inputed == "0":
        break
    
    ans = sum(int(char) for char in inputed)
    
    print(ans)