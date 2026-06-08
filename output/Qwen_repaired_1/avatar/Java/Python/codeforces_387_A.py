from datetime import datetime

s = input()
t = input()

x = datetime.strptime(s, "%H:%M")
y = datetime.strptime(t, "%H:%M")

time_difference = (x - y).seconds // 60
hours = time_difference // 60
minutes = time_difference % 60

print(f"{hours:02}:{minutes:02}")