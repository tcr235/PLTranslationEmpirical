import java.util.Scanner;

public class Main {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();

        if (keta(N) % 9 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}