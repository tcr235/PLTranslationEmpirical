import java.util.Scanner;

public class codeforces_445_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n and m separated by space: ");
        String[] nm = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        char[][] l = new char[n][m];

        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            for (int j = 0; j < m; j++) {
                if (s.charAt(j) == '.') {
                    if ((i + j) % 2 == 1) l[i][j] = 'W';
                    else l[i][j] = 'B';
                } else {
                    l[i][j] = s.charAt(j);
                }
            }
        }

        for (char[] c : l) {
            System.out.println(new String(c));
        }
    }
}