import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n and m separated by space: ");
        String[] nm = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        char[][] l = new char[n][m];

        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            s = s.toCharArray();
            for (int j = 0; j < m; j++) {
                if (s[j] == '.') {
                    if ((i + j) % 2 == 1) s[j] = 'W';
                    else s[j] = 'B';
                }
            }
            l[i] = s;
        }

        for (char[] c : l) {
            System.out.println(new String(c));
        }
    }
}