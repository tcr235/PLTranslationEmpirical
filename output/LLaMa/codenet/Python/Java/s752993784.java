import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] mods = new int[s.length()];
        int[] countRemainder = new int[2019];
        int cnt = 0;

        long m = 1;
        int mod = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            mod = (int) ((mod + (s.charAt(i) - '0') * m) % 2019);
            m = (m * 10) % 2019;

            countRemainder[mod]++;
        }

        countRemainder[0]++;

        for (int i = 0; i < 2019; i++) {
            cnt += (long) countRemainder[i] * (countRemainder[i] - 1) / 2;
        }

        System.out.println(cnt);
    }
}