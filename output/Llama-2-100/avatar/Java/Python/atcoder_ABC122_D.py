def atcoder_ABC122_D( ):
    n = int( input() )
    memo = [{} for _ in range(n+1)]
    for i in range(n+1):
        memo[i] = {}
    return dfs(0,"TTT")

def dfs(current, last3):
    if current == n:
        return 1
    result = 0
    for c in TOKENS:
        if isOK(last3+c):
            result = (result + dfs(current+1, last3.substring(1,last3.length())+c)) % MOD
    memo[current][last3] = result
    return result

def isOK(last4):
    if last4.count("AGC") > 0:
        return False
    for i in range(3):
        vals = last4.split("")
        vals[i] = last4.charAt(i+1)
        vals[i+1] = last4.charAt(i)
        s = "".join(vals)
        if s.count("AGC") > 0:
            return False
    return True

n = int(input())
print(dfs(0,"TTT"))
