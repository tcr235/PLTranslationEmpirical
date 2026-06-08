```python
from typing import List
import random

class InputReader:
    def __init__(self, in_stream):
        self._in = in_stream
        self.buffer = bytearray()
        self.pos = 0

    def read_byte(self) -> int:
        if not self.buffer:
            self.buffer.extend(self._in.read(1024))
        if len(self.buffer) == self.pos:
            raise EOFError("End of input reached")
        ch = self.buffer[self.pos]
        self.pos += 1
        return ch

    def read_until(self, target: bytes):
        buf = bytearray()
        while True:
            ch = self.read_byte()
            buf.append(ch)
            if ch == target or len(buf) >= 1024:
                break
        return bytes(buf)

    @property
    def has_more(self) -> bool:
        try:
            ch = self.read_until(b'\x00')
            return ch != b'-\x00'
        except EOFError:
            return False

    def next_int(self):
        buf = self.read_until(b'\x00')
        if buf[0] == ord('-'):
            buf = buf[1:]
            sign = -1
        else:
            sign = 1
        num = 0
        for ch in buf:
            num = num * 10 + (ch - ord('0'))
        return sign * num

    def read_line(self) -> bytes:
        line = b''
        while self.has_more:
            line += self.read_byte()
        return line.strip()

def solve(reader: InputReader):
    m = reader.next_int()
    n = reader.next_int()
    manju = [reader.next_int() for _ in range(m)]
    boxlen = [reader.next_int() for _ in range(n)]
    boxcost = [reader.next_int() for _ in range(n)]

    manju.sort()
    boxlen.sort()
    boxcost.sort()

    dp = [[0] * (n + 1) for _ in range(m + 1)]

    for i in range(m - 1, -1, -1):
        for j in range(n - 1, -1, -1):
            length = min(i + boxlen[j], m)
            count = sum(manju[length - k - 1] for k in range(length))
            dp[i][j] = max(dp[i][j],