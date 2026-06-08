import java.util.Scanner;

public class codeforces_110_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String LUCKY = "abcd";
        int n = Integer.parseInt(scanner.nextLine());
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < n; i++) {
            s.append(LUCKY.charAt(i % 4));
        }
        System.out.println(s.toString());
    }
}