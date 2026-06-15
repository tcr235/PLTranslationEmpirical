import input

class Main:

    def __init__(self):
        self.a = input.nextInt()
        self.b = input.nextInt()
        self.c = input.nextInt()

    def check(self):
        if self.a < self.b and self.b < self.c and self.a < self.c:
            print("Yes")
        else:
            print("No")

if __name__ == "__main__":
    main = Main()
    main.check()


