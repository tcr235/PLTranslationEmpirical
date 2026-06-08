def main():
    n = int(input())
    map_ = {}
    
    for _ in range(n):
        num = int(input())
        
        if num in map_:
            map_[num] += 1
        else:
            lower_keys = [k for k in map_ if k < num]
            if not lower_keys:
                map_[num] = 1
            else:
                key = max(lower_keys, key=lambda k: map_[k])
                map_[key] -= 1
                
                if map_[key] == 0:
                    del map_[key]
                    
                map_[num] = 1
    
    ans = sum(map_.values())
    print(ans)

if __name__ == "__main__":
    main()