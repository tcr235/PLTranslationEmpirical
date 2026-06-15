import sys

class Main:

    def __init__(self):
        self.stdIn = sys.stdin

    def main(self):
        r = self.stdIn.readShort()

        if r < 1200:
            print("ABC")
            return

        if r < 2800:
            print("ARC")
            return

        print("AGC")
