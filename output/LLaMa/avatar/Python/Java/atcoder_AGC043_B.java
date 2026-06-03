import java.util.*;
import java.util.function.Function;

public class atcoder_AGC043_B {

    public static int twosInFactorial(int n) {
        String binary = Integer.toBinaryString(n);
        return n - binary.length() - binary.chars().filter(c -> c == '1').count();
    }

    public static boolean parityOfNCr(int n, int i) {
        return twosInFactorial(n) - twosInFactorial(n - i) - twosInFactorial(i) > 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] input = scanner.nextLine().trim().split(" ");
        List<Integer> nums = new ArrayList<>();
        for (String num : input) {
            nums.add(Integer.parseInt(num) - 1);
        }
        boolean noOne = false;
        if (!nums.contains(0)) {
            nums.replaceAll(num -> num / 2);
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
            System.out.println(1 << noOne);
        }
    }
}