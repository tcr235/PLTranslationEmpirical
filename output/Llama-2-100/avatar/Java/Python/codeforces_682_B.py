def codeforces_682_B (): Scanner = input Scanner = input () int n = Scanner.nextInt () list = [int] list = [] for i in range (n): list.append (Scanner.nextInt ()) list.sort () c = 1 for i in range (n): if list [i] >= c: c += 1 print (c)

