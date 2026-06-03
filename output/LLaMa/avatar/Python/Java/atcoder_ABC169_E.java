import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC169_E {
    public static void resolve() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] pairs = new int[n][2];

        for (int i = 0; i < n; i++) {
            pairs[i][0] = scanner.nextInt();
            pairs[i][1] = scanner.nextInt();
        }

        Arrays.sort(pairs, (a, b) -> a[0] - b[0]);

        if (n % 2 != 0) {
            System.out.println(pairs[(n + 1) / 2 - 1][1] - pairs[(n + 1) / 2 - 1][0] + 1);
        } else {
            int hh = (pairs[n / 2 - 1][1] + pairs[n / 2][1]) / 2;
            int ll = (pairs[n / 2 - 1][0] + pairs[n / 2][0]) / 2;
            System.out.println((hh - ll) * 2 + 1);
        }
    }

    public static void main(String[] args) {
        resolve();
    }
}