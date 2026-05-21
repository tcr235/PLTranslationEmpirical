////////////////////////////////////////////////////
//                                                //
//  For her who keeps the fire kindling in me...  //
//                                                //
//////////////////////////////////////////////////

import sys

try:
    import os
except:
    pass

class FastIO:
    def __init__(self):
        self.br = sys.stdin
        self.st = ''
        self.stok()

    def stok(self):
        self.st = self.br.readline().split()

    def nextInt(self):
        if not self.st:
            self.stok()
        return int(self.st.pop(0))

    def nextLong(self):
        if not self.st:
            self.stok()
        return int(self.st.pop(0))

class Main():
    def __init__(self):
        self.fio = FastIO()

    def main(self):
        n, m = self.fio.nextInt(), self.fio.nextInt()
        penal = [0]*(n+1)
        solved = [False]*(n+1)
        for i in range(m):
            num = self.fio.nextInt()
            str = self.fio.br.readline().strip()
            if str[0] == 'A':
                solved[num] = True
            else:
                if not solved[num]:
                    penal[num] += 1
        correctans, num_penal = 0, 0
        for i in range(1, n+1):
            if solved[i]:
                correctans += 1
                num_penal += penal[i]
        print(correctans, num_penal)
        
if __name__ == '__main__':
    main = Main()
    main.main()