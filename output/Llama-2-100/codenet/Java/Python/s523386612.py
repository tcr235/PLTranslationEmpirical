def main():
    t=input()
    count= [0] * (t+1)
    for i in range(2, t+1):
        count[input()] += 1
    for i in range(1, t+1):
        print(count[i])
