def atcoder_ABC149_B(in):
    A, B, K = map(long, in.readline().split())
    x, y = A - K, B
    if x < 0:
        y = B + x
        x = 0
        if y < 0:
            y = 0
    print(x, y)

