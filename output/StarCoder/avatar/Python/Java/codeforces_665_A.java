import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int at = sc.nextInt();
        int b = sc.nextInt();
        int bt = sc.nextInt();
        String timeInput = sc.next();
        String[] parts = timeInput.split(":");
        int t1 = Integer.parseInt(parts[0]);
        int t2 = Integer.parseInt(parts[1]);
        int st = t2 + (t1 - 5) * 60;
        int fin = st + at;
        int now = 0;
        int ans = 0;
        while (now < fin && now < 1140) {
            if (now + bt > st) {
                ans++;
            }
            now += b;
        }
        System.out.println(ans);
    }
}