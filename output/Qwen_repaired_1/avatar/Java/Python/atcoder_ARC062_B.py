from sys import stdin, stdout
from io import IOBase, StringIO

class InputReader(InputBase):
    def __init__(self, stream: IO[str] = stdin.read):
        self._stream = stream
        self._input = ""
        self._pos = 0
    
    def _read_next(self):
        while self._pos >= len(self._input):
            self._input = self._stream(self)().strip()
            self._pos = 0
    
    def read(self) -> str:
        current_pos = self._pos
        self._read_next()
        result = self._input[current_pos:]
        self._pos += len(result.strip())
        return result
    
    def readline(self) -> str:
        self._read_next()
        result = self._input[self._pos:].strip()
        self._pos += len(result.strip()) + 1
        return result
    
    def next(self) -> str:
        value = ""
        while self._pos < len(self._input) and self._input[self._pos].isalnum():
            value += self._input[self._pos]
            self._pos += 1
        return value.strip()

class PrintWriter:
    def __init__(self, stream: IO[str] = stdout.buffer):
        self.stream = stream
    
    def println(self, line: str) -> None:
        self.stream.write((line + '\n').encode())
        
    def close(self) -> None:
        self.stream.close()

class TaskD:
    def solve(self, test_number: int, in_reader: 'InputReader', out_writer: 'PrintWriter') -> None:
        S = in_reader.next()
        score = 0
        for i in range(len(S)):
            if i % 2 == 0:
                my_char = 'g'
            else:
                my_char = 'p'
            
            his_char = S[i]
            
            if my_char != his_char:
                score += 1 if my_char == 'p' else -1
        
        out_writer.println(str(score))

def main() -> None:
    input_stream = stdin.read
    output_stream = stdout.buffer
    in_reader = InputReader(input_stream)
    out_writer = PrintWriter(output_stream)
    
    task_d = TaskD()
    task_d.solve(1, in_reader, out_writer)
    
    out_writer.close()

if __name__ == "__main__":
    main()