def codeforces_59_A ( word ): scanner = input ( ) uppercase = 0 lowercase = 0 for i in range ( len ( word ) ): ch = word [ i ] if ch.isupper ( ): uppercase += 1 else: lowercase += 1 if uppercase > lowercase: print ( word.title () ) else: print ( word.lower ( ) )

