import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int x = scanner.nextInt();
        List<Integer> a = new ArrayList<>();
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            a.add(scanner.nextInt());
        }
        for (int i = 1; i < N; i++) {
            int tmp = a.get(i - 1) + a.get(i);
            if (tmp > x) {
                if (tmp - x > a.get(i)) {
                    a.set(i - 1, tmp - a.get(i) - x);
                    a.set(i, 0);
                } else {
                    a.set(i, a.get(i) - (tmp - x));
                }
                cnt += tmp - x;
            }
        }
        System.out.println(cnt);
    }
}