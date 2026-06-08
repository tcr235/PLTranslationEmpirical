from sortedcontainers import SortedDict

def main():
    n = int(input())
    map_ = SortedDict()
    
    for _ in range(n):
        num = int(input())
        
        lower_key = map_.bisect_left(num) - 1
        
        if lower_key == -1 or num <= list(map_.keys())[lower_key]:
            val = map_.get(num, 0)
            map_[num] = val + 1
        else:
            key = list(map_.keys())[lower_key]
            val = map_[key]
            
            map_[key] = val - 1
            
            if val == 0:
                del map_[key]
                
            val = map_.get(num, 0)
            map_[num] = val + 1
    
    ans = sum(map_.values())
    print(ans)

if __name__ == "__main__":
    main()