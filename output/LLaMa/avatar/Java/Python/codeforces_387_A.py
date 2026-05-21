import datetime

def main():
    s = input().split(":")
    t = input().split(":")

    x = datetime.datetime.strptime(f"{s[0]}:{s[1]}", "%H:%M")
    y = datetime.datetime.strptime(f"{t[0]}:{t[1]}", "%H:%M")

    time_diff = (x - y).replace(hour=0, minute=0)

    print(time_diff)

if __name__ == "__main__":
    main()