import heapq
import sys

class MyScanner:
    def __init__(self, stream=sys.stdin.buffer):
        self.stream = stream
        self.buf = bytearray()

    def read(self, size_or_iter=None):
        if size_or_iter is None:
            s = self.stream.read()
            if s:
                self.buf.extend(s)
            return bytes(self.buf).decode('utf-8')
        else:
            return self.buf[:size_or_iter]

    def readline(self):
        data = b""
        while True:
            t = self.stream.readline()
            data = data + t
            if t.endswith(b'\n'):
                break
        return data.decode("utf-8")

    def next(self):
        for byte in self.stream:
            if byte == ord(' ') or byte == ord('\n'):
                break
            else:
                self.buf.append(byte)

        res = str(self.buf).split()
        if res:
            self.buf = bytearray()
            return str(*res or [''])
        else:
            res = str(data).split("\n")
            data = b""

            s = ""
            s = s.join(res[:-1])
            data = bytes([ord(t) for t in s]).buffer

        return str(next(reader))

reader = map(str.split,[l.rstrip() for l in MyScanner().readline().splitlines()])

N,M=next(reader)
N=int(N)
M=int(M)

D={k:{} for k in range(0,int(M)+1)}
K=[]
F=[0]*int(M+1)

while reader:
    A,B,=next(reader)
    A=int(A)
    B=int(B)
    K.append(K[-1]+B-A)

for I in range(1,len(K)):
    F[K[I]-A]=I
    D[I][len(D[I])+1]=B
    E=K.pop(I)*[E]*(len(E)-1)+[B+A]

G=[]

for F,I,J in zip(F,K,E):
    heapq.heappush(G,(1,-I))
    heapq.heappush(G,(0,J-A-F))

print(-sum(sorted(G)[-2::-2]))

sys.stdout.flush()