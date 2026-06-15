#!/usr/bin/env python
# -*- coding: utf-8 -*-

import sys

def read():
	if sys.stdin.readline().strip():
		return True
	else:
		return False

def solve():
	ans = 0
	for i in range(1, 600 / d + 1):
		x = i * d
		y = x * x
		ans += y * d
	return ans

while read():
	print solve()

