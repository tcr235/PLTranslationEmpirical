import sys
import stdio

def main():
    br = stdio.input()
    pw = stdio.output
    input_array = br.readline().split()
    result = 0
    for str in input_array:
        result += 1
        if str == "0":
            break
    pw.write(result)
    br.close()
    pw.close()

