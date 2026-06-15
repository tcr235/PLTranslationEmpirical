import java.util.Scanner;

public class s486032847 {
    public static boolean isKeta(String s) {
        if (s.length() < 2) {
            return true;
        }
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            n += Integer.parseInt(s.charAt(i));
        }
        return isKeta(String.valueOf(n));
    }

    public static boolean main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        if (isKeta(n)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        return true;
    }
}
