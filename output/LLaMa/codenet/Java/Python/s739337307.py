import sys

class Main:
    def main(self):
        try:
            n, m = map(int, input().split())

            map_ = {}

            count_ac = 0
            count_wa_all = 0

            for _ in range(m):
                question = int(input())
                wa_or_ac = input()

                if question not in map_:
                    if wa_or_ac == "WA": 
                        map_[question] = 1
                    else:
                        map_[question] = -1
                        count_ac += 1
                else:
                    count_wa = map_[question]

                    if count_wa < 0:
                        pass
                    else:
                        if wa_or_ac == "WA": 
                            map_[question] = count_wa + 1
                        else:
                            map_[question] = -count_wa
                            count_ac += 1
                            count_wa_all += count_wa

            print(f"{count_ac} {count_wa_all}")

        except Exception as e:
            print(e)

if __name__ == "__main__":
    Main().main()