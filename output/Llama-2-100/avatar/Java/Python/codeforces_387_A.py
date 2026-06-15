import stdio
import time
list = stdio.split(input(),":")
x = time.LocalTime(int(list[0]),int(list[1]))
y = time.LocalTime(int(list[2]),int(list[3]))
print(x.replace(y.hour,y.minute))

