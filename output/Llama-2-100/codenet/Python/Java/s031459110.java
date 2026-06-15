import java.util.Scanner;

public class s031459110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String c = sc.next();

        int num_w = c.indexOf("W") + 1;
        int num_r = N - num_w;

        String comp = "R" + num_r + "W" + num_w;
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
