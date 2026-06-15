import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atcoder_ABC140_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = gi();
        int K = gi();
        int S[] = new int[N];
        int seg_cnt = 0;
        for (int i = 0; i < N - 1; i++) {
            if (S[i] != S[i + 1]) {
                seg_cnt++;
            }
        }
        int cur_happy = N - 1 - seg_cnt;
        if (2 * K >= seg_cnt) {
            ans = N - 1;
        } else {
            ans = cur_happy + 2 * K;
        }
        System.out.println(ans);
    }

    public static int gi() {
        return Integer.parseInt(scanner.nextLine());
    }

    public static int gw() {
        return Integer.parseInt(scanner.nextLine());
    }
}
