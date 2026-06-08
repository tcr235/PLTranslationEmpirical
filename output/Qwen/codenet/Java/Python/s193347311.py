def main():
    int_loop = int(input())
    int_taro = 0
    int_hana = 0

    for _ in range(int_loop):
        str_taro = input()
        str_hana = input()
        int_judge = str_taro.compare_to(str_hana)
        if int_judge < 0:
            int_hana += 3
        elif int_judge == 0:
            int_taro += 1
            int_hana += 1
        elif 0 < int_judge:
            int_taro += 3

    print(int_taro, int_hana)

if __name__ == "__main__":
    main()