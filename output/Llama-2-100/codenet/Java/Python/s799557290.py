def main():
    a = int(input())
    b = int(input())
    ju = [False] * 100001
    pe = [0] * 100001
    wa = 0
    ac = 0
    
    for i in range(b):
        n = int(input())
        res = input()
        
        if res == "WA" and not ju[n-1]:
            pe[n-1] += 1
        
        if res == "AC":
            ju[n-1] = True
    
    for i in range(a):
        if ju[i]:
            ac += 1
            wa += pe[i]
    
    print(f"{ac} {wa}")

