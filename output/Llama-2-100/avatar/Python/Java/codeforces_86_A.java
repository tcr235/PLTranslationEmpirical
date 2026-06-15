import java.util.Scanner;

public class codeforces_86_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int s = 0;
        int curr = r;
        int first = (1 << s);
        int second = first / 2;
        int ans = -1;
        for (int i = l; i <= r; i++) {
            if (i >= l && i <= r) {
                s++;
                curr /= 10;
                String rev = "";
                for (int k = String.valueOf(curr).length() - 1; k >= 0; k--) {
                    rev += String.valueOf(9 - Integer.parseInt(String.valueOf(curr).charAt(k)));
                }
                ans = Math.max(ans, Integer.parseInt(rev) * curr);
            }
        }
        System.out.println(ans);
    }
}


