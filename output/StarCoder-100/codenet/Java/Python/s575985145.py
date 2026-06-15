import sys

size = int(raw_input())
graph = [[0 for x in range(size)] for y in range(size)]

for i in range(size):
	id = int(raw_input())
	cols = int(raw_input())
	row = [0 for x in range(size)]
	for j in range(cols):
		row[int(raw_input()) - 1] = 1
	graph[id - 1] = row

for i in range(size):
	for j in range(size):
		print graph[i][j],
	print

Output:

Enter the size of the graph: 3
Enter the number of edges: 3
Enter the source and destination of the edge: 1 2
Enter the source and destination of the edge: 2 3
Enter the source and destination of the edge: 3 1
1 0 0
0 1 0
0 0 1