import java.util.Scanner;

public class atcoder_AGC043_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] inputArray = scanner.next().trim().split(" ");
        int noOne = 0;
        boolean containsOne = false;
        for (int i = 0; i < inputArray.length; i++) {
            int num = Integer.parseInt(inputArray[i]) - 1;
            if (!containsOne && num == 0 && i == inputArray.length - 1) {
                System.out.println(0);
                return;
            }
            if (num == 0 && !containsOne) {
                containsOne = true;
                continue;
            }
            inputArray[i] = String.valueOf(num / 2);
        }

        if (!containsOne) {
            noOne++;
        }

        int isOdd = 0;
        for (int i = 0; i < inputArray.length; i++) {
            int num = Integer.parseInt(inputArray[i]);
            if ((n - 1 - i) % 2 != 0 && (num & 1) != 0) {
                isOdd = 1 - isOdd;
            }
        }

        if (isOdd == 0) {
            System.out.println(0);
        } else {
            System.out.println(1 << noOne);
        }
    }

    private static int countTwosInFactorial(int n) {
        return n - Integer.bitCount(n);
    }

    private static int parityOfNCR(int n, int i) {
        return countTwosInFactorial(n) - countTwosInFactorial(n - i) - countTwosInFactorial(i) > 0 ? 1 : 0;
    }
}