import java.util.*;
public class codeforces_445_A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[][] l = new String[n][m];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < m; j++) {
                if (s.charAt(j) == '.') {
                    if ((i + j) % 2 == 1)
                        s = s.substring(0, j) + "W" + s.substring(j + 1);
                    else
                        s = s.substring(0, j) + "B" + s.substring(j + 1);
                }
            }
            l[i] = s.split("");
        }
        for (String[] s : l) {
            for (String c : s)
                System.out.print(c);
            System.out.println();
        }
    }
}
