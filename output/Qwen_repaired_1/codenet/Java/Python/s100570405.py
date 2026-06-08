import sys

sys.stdin = open(sys.argv[1], 'r')

class InputReader:
    def __init__(self):
        self.input = sys.stdin.read()
        self.tokens = self.input.split()
        self.idx = 0
        self.n = len(self.tokens)

    def has_next(self):
        return self.idx < self.n

    def next(self):
        token = self.tokens[self.idx]
        self.idx += 1
        return token

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())
    
    def next_line(self):
        return '\n'

def main():
    s_d = InputReader().next()
    t = InputReader().next()
    count = 0
    first = -1
    end = -1
    
    for j in range(len(s_d)):
        count = 0
        for i in range(j, len(s_d)):
            c = s_d[i]
            if c == '?' or c == t[count]:
                count += 1
                if count == len(t):
                    first = i - len(t) + 1
                    end = i
                    break
            else:
                count = 0
                
        if count == len(t):
            break
            
    if first != -1 and end != -1:
        for i, c in enumerate(s_d):
            if first <= i <= end:
                print(t[i - first], end='')

            elif c == '?':
                print('a', end='')
                
            else:
                print(c, end='')
        
        print('\n')
        
        
    else:
        print("UNRESTORABLE")

if __name__ == '__main__':
   
    main()