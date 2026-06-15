def fast_reader():
    br = input()
    st = None
    while st is None or not st.next():
        try:
            st = tokenize(br.readline())
        except Exception as e:
            print(e)
    return st.next()

def next_int():
    return int(fast_reader())

def next_long():
    return long(fast_reader())

def next_double():
    return double(fast_reader())

def next_line():
    return input()

def mod_power(x, y, mod):
    res = 1
    x %= mod
    if x == 0:
        return 0
    while y > 0:
        if y % 2 == 1:
            res = (res * x) % mod
        y //= 2
        x = (x * x) % mod
    return res

class pair:
    def __init__(self, first, second):
        self.first = first
        self.second = second

def main():
    a = [long(fast_reader()) for _ in range(4)]
    print(max(a[0] * a[2], max(a[1] * a[3], max(a[0] * a[3], a[1] * a[2]))))
