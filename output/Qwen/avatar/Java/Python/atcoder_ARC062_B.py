from sys import stdin

def main():
    input_stream = stdin
    output_stream = stdout
    in_reader = InputReader(input_stream)
    out_writer = PrintWriter(output_stream)
    
    task_d = TaskD()
    task_d.solve(1, in_reader, out_writer)
    
    out_writer.close()

class TaskD:
    def __init__(self):
        pass
    
    def solve(self, test_number: int, in_reader: 'InputReader', out_writer: 'PrintWriter'):
        S = in_reader.next().strip()
        score = 0
        for i in range(len(S)):
            if i % 2 == 0:
                my_char = 'g'
            else:
                my_char = 'p'
            
            his_char = S[i]
            
            if my_char != his_char:
                score += 1 if my_char == 'p' else -1
        
        print(score)

class InputReader:
    def __init__(self, stream: IO[str] = stdin.buffer):
        self.reader = stream
        self.tokenizer = None
    
    def next(self) -> str:
        if self.tokenizer is None or not self.tokenizer:
            self.tokenizer = iter(self.reader.read().decode().split())
        
        return next(self.tokenizer).strip()

class PrintWriter:
    def __init__(self, stream: IO[str] = stdout.buffer):
        self.stream = stream
    
    def println(self, line: str) -> None:
        self.stream.write((line + '\n').encode())
        
    def close(self) -> None:
        self.stream.close()

if __name__ == "__main__":
    main()