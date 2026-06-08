import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class atcoder_ABC114_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(aaa('0', N));
    }

    public static int aaa(char n, int N) {
        int num = Character.getNumericValue(n);
        if (num > N) {
            return 0;
        }
        if (isComposedOf(num)) {
            return count(num, N) + 1;
        } else {
            return count(num, N);
        }
    }

    private static boolean isComposedOf(int n) {
        Set<String> digits = new HashSet<>();
        while (n > 0) {
            digits.add(Integer.toString(n % 10));
            n /= 10;
        }
        return digits.equals(Set.of("7", "5", "3"));
    }

    private static int count(char n, int N) {
        int num = Character.getNumericValue(n);
        int result = 0;
        for (char digit : new char[] {'7', '5', '3'}) {
            try {
                result += aaa((char)(num*10 + Character.getNumericValue(digit)), N);
            } catch (Exception e) {
            }
        }
        return result;
    }
}