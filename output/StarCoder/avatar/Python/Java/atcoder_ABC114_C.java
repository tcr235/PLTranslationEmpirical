import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(aaa(0, N));
    }

    public static int aaa(int n, int N) {
        if (n > N) {
            return 0;
        }
        if (isComposedOf(n)) {
            return count(n, N) + 1;
        } else {
            return count(n, N);
        }
    }

    private static boolean isComposedOf(int n) {
        Set<String> digits = new HashSet<>();
        while (n != 0) {
            digits.add(Integer.toString(n % 10));
            n /= 10;
        }
        return digits.equals(Set.of("7", "5", "3"));
    }

    private static int count(int n, int N) {
        int result = 0;
        String digits = Integer.toString(n);
        for (char digit : digits.toCharArray()) {
            try {
                result += aaa(n * 10 + Character.getNumericValue(digit), N);
            } catch (NumberFormatException e) {
                // Handle error if needed
            }
        }
        return result;
    }
}