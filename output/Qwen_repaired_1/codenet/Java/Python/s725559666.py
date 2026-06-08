def main():
    import sys
    from typing import TextIO, Union

    class Scanner:
        def __init__(self, input_stream: TextIO):
            self.input_stream = input_stream
            self.current_line = self.input_stream.readline().strip()
            self.tokens = self.current_line.split()
            self.index = 0

        def hasNext(self) -> bool:
            return self.index < len(self.tokens)

        def nextInt(self) -> int:
            if not self.hasNext():
                raise ValueError("No more tokens to read")
            token = self.tokens[self.index]
            self.index += 1
            try:
                return int(token)
            except ValueError:
                raise ValueError(f"Expected an integer but found: {token}")

    sys.stdin.reconfigure(encoding='utf-8')
    scanner = Scanner(sys.stdin)
    a = scanner.nextInt()
    b = scanner.nextInt()
    c = scanner.nextInt()
    scanner.input_stream.close()
    
    if a < b and b < c and a < c:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()