def codeforces_567_A (): Scanner = input () a = int ( Scanner . next () ) ar = [ int ( Scanner . next ()) for _ in range (a) ] max = 0 min = 0 for i in range (len (ar)): max = max (ar [i] - ar [0], ar [len (ar) - 1] - ar [i]) if i == 0: min = min (ar [i + 1] - ar [i], ar [0] - ar [i - 1]) else: min = min (ar [i] - ar [i - 1], ar [i + 1] - ar [i]) print (min + " " + max)

