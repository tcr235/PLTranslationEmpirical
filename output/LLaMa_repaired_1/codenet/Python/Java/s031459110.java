import java.util.Scanner;

public class s031459110 {
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

        for (int i = 0; i < Math.min(num_r, c.length()); i++) {
            if (c.charAt(i) != comp.charAt(i)) {
                ans++;
            }
        }

        ans = Math.min(ans, Math.min(num_w, num_r));

        System.out.println(ans);
    }
}