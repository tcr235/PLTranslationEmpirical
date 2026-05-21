def calculate_times(n, c, s, f):
    times = []
    
    for i in range(n-1):
        time = s[i] + c[i]
        
        while any((time % f[k] != 0 or time < s[k]) for k in range(i+1, n-1)):
            for k in range(i+1, n-1):
                if (time % f[k] != 0 and time >= s[k]):
                    time += f[k] - (time % f[k])
                elif time < s[k]:
                    time = s[k]
            
            for k in range(i+1, n-1):
                time += c[k]

        times.append(max(s[k]+c[k] if k <= i else time + c[k] for k in range(n-1)))
    
    return times

n = int(input("Enter number of jobs: "))
jobs = [list(map(int, input().split())) for _ in range(n-1)]

times = calculate_times(n, *(job[::-1] for job in jobs))
for time in times:
    print(time)
print(0)