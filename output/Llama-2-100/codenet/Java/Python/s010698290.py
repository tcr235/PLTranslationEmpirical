////////////////////////////////////////////////////
                    //                                                //
                    //  For her who keeps the fire kindling in me...  //
                    //                                                //
                    ////////////////////////////////////////////////////

import java.io
import java.util

class FastReader:
    def __init__(self):
        self.br = java.io.BufferedReader(java.io.InputStreamReader(sys.stdin))
        self.st = None

    def next(self):
        while self.st is None or not self.st.hasMoreElements():
            try:
                self.st = java.util.StringTokenizer(self.br.readLine())
            except java.io.IOException as e:
                print("Error:", e)
                sys.exit(1)
        return self.st.nextToken()

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return long(self.next())

    def nextDouble(self):
        return float(self.next())

    def nextLine(self):
        return self.br.readLine()

class Main:

    def __init__(self):
        pass

    def main(self, args):
        try:
            fr = FastReader()
            with java.io.BufferedWriter(java.io.OutputStreamWriter(sys.out)) as w:
                n = fr.nextInt()
                m = fr.nextInt()

                penal = [0] * (n + 1)
                solved = [False] * (n + 1)
                for i in range(m):
                    num = fr.nextInt()
                    str = fr.next()
                    if str[0] == 'A':
                        solved[num] = True
                    elif not solved[num]:
                        penal[num] += 1

                correct_ans = 0
                num_penal = 0
                for i in range(1, n + 1):
                    if solved[i]:
                        correct_ans += 1
                        num_penal += penal[i]

                w.write(f"{correct_ans} {num_penal}\n")
                w.close()
        except Exception as e:
            print("Error:", e)
            sys.exit(1)

if __name__ == "__main__":
    Main().main(sys.argv)