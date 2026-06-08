def solve():
    n = int(input())
    FfriendPerDay = [0] * 367
    MfriendPerDay = [0] * 367
    answer = 0

    for _ in range(n):
        inputs = input().split()
        c = inputs[0][0]
        start_day = int(inputs[1])
        end_day = int(inputs[2])

        for day in range(start_day, end_day + 1):
            if c == 'M':
                MfriendPerDay[day] += 1
            else:
                FfriendPerDay[day] += 1

            max_friends = max(MfriendPerDay[day], FfriendPerDay[day])
            if max_friends > answer:
                answer = max_friends

    print(answer * 2)

if __name__ == "__main__":
    solve()