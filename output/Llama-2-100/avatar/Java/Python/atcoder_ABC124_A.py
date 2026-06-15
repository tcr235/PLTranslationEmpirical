def atcoder_ABC124_A (): Scanner = input () a = int ( Scanner.next ( ) ) b = int ( Scanner.next ( ) ) sum = 0 for i in range ( 2 ): if a >= b: sum += a a = a - 1 else: sum += b b = b - 1 print ( sum )

