def atcoder_ABC169_C (): Scanner = input () a = Scanner.nextLong () b = Scanner.next () bChar = b.encode () length = len ( bChar ) bStr = "" for i in range ( length ): if bChar [ i ] != '.': bStr += bChar [ i ] bInt = int ( bStr ) result = ( a * bInt ) // 100 print ( result )

