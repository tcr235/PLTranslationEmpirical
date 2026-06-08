import java.util.ArrayList;
import java.util.Scanner;

public class atcoder_AGC043_B {

    public static int twosInFactorial(int n) {
        String binary = Integer.toBinaryString(n);
        int count = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                count++;
            }
        }
        return n - binary.length() - count;
    }

    public static boolean parityOfNCr(int n, int i) {
        int sum = 0;
        sum += twosInFactorial(n) - twosInFactorial(n - i) - twosInFactorial(i);
        return sum > 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] input = scanner.nextLine().trim().split(" ");
        ArrayList<Integer> nums = new ArrayList<>();
        for (String num : input) {
            nums.add(Integer.parseInt(num) - 1);
        }
        boolean noOne = false;
        if (!nums.contains(0)) {
            ArrayList<Integer> newNums = new ArrayList<>();
            for (Integer num : nums) {
                newNums.add(num / 2);
            }
            nums = newNums;
            noOne = true;
        }
        boolean isOdd = false;
        for (int i = 0; i < nums.size(); i++) {
            if (!parityOfNCr(n - 1, i) && nums.get(i) % 2 != 0) {
                isOdd ^= true;
            }
        }
        if (!isOdd) {
            System.out.println(0);
        } else {
            System.out.println((noOne) ? 1 : 1 << 1);
        }
    }
}