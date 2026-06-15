
import sys
import re

class Main:
	def __init__(self):
		self.sc = re.compile(r'\s*(\d+)\s*').match
		self.run()

	def tr(self, *os):
		print(*os, file=sys.stderr)

	def run(self):
		for line in sys.stdin:
			m = self.sc(line)
			if not m:
				break
			my1, my2, enemy1 = map(int, m.groups())
			used = [False] * 11
			used[my1] = used[my2] = used[enemy1] = True
			all = safe = 0
			for i in range(1, 11):
				if not used[i]:
					all += 1
					if my1 + my2 + i <= 20:
						safe += 1
			if safe * 2 >= all:
				print('YES')
			else:
				print('NO')

Main()

