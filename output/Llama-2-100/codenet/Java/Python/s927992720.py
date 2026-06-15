import input

def main():
    scanner = input.scanner()
    
    while True:
        a = scanner.nextInt()
        op = scanner.next()
        b = scanner.nextInt()
        
            if op == "?": break
            if op == "+": print(a+b)
            if op == "-": print(a-b)
            if op == "*": print(a*b)
            if op == "/": print(a/b)

