import java
import math

class FastScanner:
    def __init__(self):
        self.br=java.io.BufferedReader(java.io.InputStreamReader(java.io.System.in))
        self.st=java.lang.StringTokenizer("")

    def next(self):
        while not self.st.hasMoreTokens():
            try:
                self.st=java.lang.StringTokenizer(self.br.readLine())
            except java.io.IOException:
                pass
        return self.st.nextToken()

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return long(self.next())

    def nextDouble(self):
        return float(self.next())

class OutPut:
    def __init__(self):
        self.w=java.io.PrintWriter(java.io.System.out)

    def pln(self,x):
        self.w.println(x)
        self.w.flush()

    def p(self,x):
        self.w.print(x)
        self.w.flush()

class Main:
    def __init__(self):
        self.ans=100
        self.balls=[[0,0] for i in range(100)]
        self.N=java.lang.Integer.parseInt(FastScanner().next())

    def solve():
        for i in range(1, self.N):
            taken=[]
            p=self.balls[i][0]-self.balls[0][0]
            q=self.balls[i][1]-self.balls[0][1]
            ans=min(ans,check(p,q))

    def check(self,p,q):
        ret=0
        while True:
            taken=[]
            start=0
            x=y=0
            for j in range(self.N):
                if not taken[j]:
                    taken.append(j)
                    ret+=1
                    start=j
                    x=self.balls[j][0]+p
                    y=self.balls[j][1]+q
                    break
            if x==self.balls[start][0] and y==self.balls[start][1]:
                break
            for j in range(start+1,self.N):
                if self.balls[j][0]==x and self.balls[j][1]==y:
                    taken.append(j)
                    x+=p
                    y+=q

    def main(self):
        FastScanner().next()
        for i in range(self.N):
            self.balls[i][0]=int(FastScanner().next())
            self.balls[i][1]=int(FastScanner().next())
        Arrays.sort(self.balls, lambda a, b: int(a[0]) - int(b[0]))
        self.solve()
        OutPut().pln(ans)

if __name__=="__main__":
    Main()