# ========================================### FAST IO ###=========================================#
class FastReader:
    def __init__(self):
        self.s = input()

    def next(self):
        self.s = self.s.strip()
        self.i = self.i + 1
        return self.s[self.i - 1]

    def nextInt(self):
        self.i = self.i + 1
        return int(self.s[self.i - 1])

    def nextLong(self):
        self.i = self.i + 1
        return int(self.s[self.i - 1])

    def nextDouble(self):
        self.i = self.i + 1
        return float(self.s[self.i - 1])

    def nextLine(self):
        self.s = self.s.strip()
        self.i = self.i + 1
        return self.s[self.i - 1]
# ===================================================================================================#
