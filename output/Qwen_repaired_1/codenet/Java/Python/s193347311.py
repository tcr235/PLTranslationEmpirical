def main():
    int_loop = int(input())
    int_taro = 0
    int_hana = 0

    for _ in range(int_loop):
        str_taro = input().strip()
        str_hana = input().strip()
        if str_taro < str_hana:
            int_hana += 3
        elif str_taro == str_hana:
            int_taro += 1
            int_hana += 1
        else:
            int_taro += 3

    print(int_taro, int_hana)

if __name__ == "__main__":
    main()