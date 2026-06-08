```python
import heapq
import sys

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
            return ord(self.buf[self.ptr])
        else:
            return -1

    def readInt(self):
        res = 0
        while True:
            c = self.readByte()
            if not str(c).isdigit() and c != '-':
                break
            res = res * 10 + c
        if c == '-':
            res = -res
        return res

    def __next_token(self):
        while True:
            c = self.readByte()
            if c == -1 or c == ' ' or c == '\n':
                continue
            elif c == '\n':
                break
            elif c == '\t' or c == ' ':
                return self.__next_token()
            return c

    def next(self):
        ch = self.__next_token()
        while ch == '\t' or ch == ' ':
            ch = self.__next_token()
        return ch

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
            if not str(c).isdigit():
                break
            res = res * 10 + c
        return res

    def readLongArray(self, n):
        res = []
        for _ in range(n):
            res.append(self.readLong())
        return res

    def readIntArray(self, n):
        res = []
        for _ in range(n):
            res.append(self.readInt())
        return res

class MyWriter:
    def __init__(