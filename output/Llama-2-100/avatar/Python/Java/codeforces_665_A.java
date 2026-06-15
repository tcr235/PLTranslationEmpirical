import java.util.Scanner;

public class codeforces_665_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, at = 0, b, bt = 0, t1, t2, st, fin, now = 0, ans = 0;
        String line = sc.nextLine();
        String[] split = line.split(":");
        t1 = Integer.parseInt(split[0]);
        t2 = Integer.parseInt(split[1]);
        st = t2 + (t1 - 5) * 60;
        fin = st + at;
        now = 0;
        while (now < fin && now < 1140) {
            if (now + bt > st) {
                ans++;
            }
            now += b;
        }
        System.out.println(ans);
    }
}


