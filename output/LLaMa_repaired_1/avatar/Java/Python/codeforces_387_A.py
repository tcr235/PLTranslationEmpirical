import datetime

def main():
    s = input().split(":")
    t = input().split(":")

    x = datetime.datetime.strptime(f"{s[0]}:{s[1]}", "%H:%M").replace(year=1900, month=1, day=1)
    y = datetime.datetime.strptime(f"{t[0]}:{t[1]}", "%H:%M").replace(year=1900, month=1, day=1)

    time_diff = x - y

    print(time_diff)

if __name__ == "__main__":
    main()