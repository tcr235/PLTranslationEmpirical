import sys

class Node:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None

    def insert(self, new_value):
        if new_value < self.value:
            if self.left is None:
                self.left = Node(new_value)
            else:
                self.left.insert(new_value)
        else:
            if self.right is None:
                self.right = Node(new_value)
            else:
                self.right.insert(new_value)

    def printInOrder(self):
        if self.left is not None:
            self.left.printInOrder()
        print(" " + str(self.value))
        if self.right is not None:
            self.right.printInOrder()

    def printPreOrder(self):
        print(" " + str(self.value))
        if self.left is not None:
            self.left.printPreOrder()
        if self.right is not None:
            self.right.printPreOrder()

def main():
    n = int(input())
    scanner = Scanner(sys.stdin)

    tree = Node(0)

    for i in range(n):
        command = scanner.next()

        if command == "insert":
            key = scanner.nextLong()
            tree.insert(key)

        elif command == "printInOrder":
            tree.printInOrder()

        elif command == "printPreOrder":
            tree.printPreOrder()

if __name__ == "__main__":
    main()


