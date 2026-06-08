```python
from typing import List

def input_reader() -> str:
    return sys.stdin.readline

class InputReader:
    def __init__(self, input_func):
        self.input_func = input_func

    def readByte(self) -> int:
        line = self.input_func()
        return ord(line[0])

    def isSpaceChar(self, c: int) -> bool:
        return not (c >= 33 and c <= 126)

    def skip(self) -> int:
        byte = self.readByte()
        while byte != -1 and self.isSpaceChar(byte):
            byte = self.readByte()
        return byte

    def next(self) -> str:
        byte = self.skip()
        sb = ''
        while byte != -1 and not self.isSpaceChar(byte):
            sb += chr(byte)
            byte = self.readByte()
        return sb

    def nextInt(self) -> int:
        byte = self.skip()
        minus = False
        if byte == ord('-'):
            minus = True
            byte = self.readByte()
        res = 0
        while not self.isSpaceChar(byte):
            if byte < ord('0') or byte > ord('9'):
                raise Exception('Invalid Input')
            res = res * 10 + byte - ord('0')
            byte = self.readByte()
        return -res if minus else res

    def nextLong(self) -> int:
        byte = self.skip()
        minus = False
        if byte == ord('-'):
            minus = True
            byte = self.readByte()
        res = 0
        while not self.isSpaceChar(byte):
            if byte < ord('0') or byte > ord('9'):
                raise Exception('Invalid Input')
            res = res * 10 + byte - ord('0')
            byte = self.readByte()
        return -res if minus else res

def sort(a: List[int]) -> None:
    for i in range(len(a) - 1, 0, -1):
        j = random.randint(0, i)
        a[i], a[j] = a[j], a[i]
    a.sort()

def solve(m: int, n: int, manju: List[int], boxlen: List[int], boxcost: List[int]) -> None:
    INF = 2**31 // 2
    LINF = 2**63 // 2
    dp = [[-INF] *