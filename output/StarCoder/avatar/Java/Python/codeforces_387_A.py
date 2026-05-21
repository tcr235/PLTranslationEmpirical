from datetime import time

input_str = input().split(":")
x = time(int(input_str[0]), int(input_str[1]))

input_str = input().split(":")
y = time(int(input_str[0]), int(input_str[1]))

print((x.hour - y.hour) % 24, abs(x.minute - y.minute), sep=":")