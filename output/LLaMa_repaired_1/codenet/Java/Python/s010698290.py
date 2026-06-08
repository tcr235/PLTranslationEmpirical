import sys

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

class Main:
    def __init__(self):
        self.fio = FastIO()

    def main(self):
        try:
            n = self.fio.nextInt()
            m = self.fio.nextInt()
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

            correct_ans, num_penal = 0, 0
            for i in range(1, n+1):
                if solved[i]:
                    correct_ans += 1
                    num_penal += penal[i]

            print(correct_ans, num_penal)

        except Exception as e:
            print(e)

if __name__ == '__main__':
    main = Main()
    main.main()