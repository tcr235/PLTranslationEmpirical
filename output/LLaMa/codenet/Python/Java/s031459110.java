import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int N = scanner.nextInt();

        System.out.println("Enter a string: ");
        String c = scanner.next();

        int num_w = c.length() - c.replace("W", "").length();
        int num_r = N - num_w;
        String comp = "R".repeat(num_r) + "W".repeat(num_w);
        int ans = 0;

        for (int i = 0; i < num_r; i++) {
            if (c.charAt(i) != comp.charAt(i)) {
                ans++;
            }
        }

        ans = Math.min(num_w, num_r, ans);

        System.out.println(ans);
    }
}