```python
import heapq
from typing import List

class MyScanner:
    def __init__(self, in_stream):
        self.in_stream = in_stream

    def readByte(self):
        if self.in_stream.tell() != 0:
            self.in_stream.seek(0, 2)
            buf = self.in_stream.read(8192)
            self.in_stream.seek(0)
            self.buf = buf
            self.buf_len = len(buf)
            self.ptr = 0
        else:
            self.buf = self.in_stream.read(8192)
            self.buf_len = len(self.buf)
            self.ptr = 0
        if self.ptr < self.buf_len:
            return self.buf[self.ptr]
        else:
            return -1

    def readInt(self):
        res = 0
        while True:
            c = self.readByte()
            if not c.isdigit() and c != '-':
                break
            res = res * 10 + int(c)
        if c == '-':
            res = -res
        return res

    def next(self):
        while True:
            c = self.readByte()
            if c == -1 or c == ' ' or c == '\n':
                continue
            elif c == '\n':
                break
            elif c == '\t' or c == ' ':
                return self.next()
            return c

    def nextLong(self):
        minus = 0
        while True:
            c = self.readByte()
            if c == '-':
                minus = 1
                continue
            if c == ' ' or c == '\n':
                return minus * self.readLong()
            return minus * self.readInt()

    def readLong(self):
        res = 0
        while True:
            c = self.readByte()
            if not c.isdigit():
                break
            res = res * 10 + int(c)
        return res

    def readLongArray(self, n):
        res = []
        for _ in range(n):
            res.append(self.readLong())
        return res

class MyWriter:
    def __init__(self, out_stream):
        self.out_stream = out_stream

    def joinAndPrintln(self, x, delimiter):
        res = ''
        for i, v in enumerate(x):
            res += str(v)
            if i != len(x) - 1:
                res += delimiter
        self.out_stream.write(res + '\n')

def main