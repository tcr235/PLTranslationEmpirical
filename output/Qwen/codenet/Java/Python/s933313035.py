class Node:
    def __init__(self):
        self.value = None
        self.left = None
        self.right = None

    def insert(self, newValue):
        if newValue < self.value:
            if self.left is None:
                self.left = Node()
                self.left.value = newValue
            else:
                self.left.insert(newValue)
        else:
            if self.right is None:
                self.right = Node()
                self.right.value = newValue
            else:
                self.right.insert(newValue)

    def print_in_order(self, result=None):
        if result is None:
            result = []
        if self.left:
            self.left.print_in_order(result)
        result.append(str(self.value))
        if self.right:
            self.right.print_in_order(result)
        return ' '.join(result)

    def print_pre_order(self, result=None):
        if result is None:
            result = []
        result.append(str(self.value))
        if self.left:
            self.left.print_pre_order(result)
        if self.right:
            self.right.print_pre_order(result)
        return ' '.join(result)


def main():
    scanner = input().split()
    
    m = int(scanner[0])
    
    node = None
    index = 1
    for _ in range(m):
        command = scanner[index]
        index += 1
        
        if command == "insert":
            key = int(scanner[index])
            index += 1
            
            if node is None:
                node = Node()
                node.value = key
            else:
                node.insert(key)
        else:
            if node:
                print(node.print_in_order())
                print()
                print(node.print_pre_order())
            

if __name__ == "__main__":
    main()