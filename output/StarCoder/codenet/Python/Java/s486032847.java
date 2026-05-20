import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.nextLine();
        // String[] inputs = scanner.nextLine().split(" ");
        // int N = Integer.parseInt(inputs[0]);
        // int X = Integer.parseInt(inputs[1]);
        // int T = Integer.parseInt(inputs[2]);

        if (keta(N) % 9 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static int keta(String s) {
        if (s.length() < 2) {
            return Integer.parseInt(s);
        }
        int n = 0;
        for (char c : s.toCharArray()) {
            n += Character.getNumericValue(c);
        }
        return keta(String.valueOf(n));
    }
}