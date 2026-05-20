import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] S = new int[n];
        for (int i = 0; i < n; i++) {
            S[i] = scanner.nextInt();
        }

        int q = scanner.nextInt();
        int[] T = new int[q];
        for (int i = 0; i < q; i++) {
            T[i] = scanner.nextInt();
        }

        int ans = 0;
        Arrays.sort(S);
        for (int i = 0; i < q; i++) {
            if (Arrays.binarySearch(S, T[i]) >= 0) {
                ans++;
                continue;
            }
            int left = 0;
            int right = S.length - 1;
            while (right - left > 1) {
                int mid = (left + right) / 2;
                if (S[mid] == T[i]) {
                    ans++;
                    break;
                } else if (S[mid] < T[i]) {
                    left = mid;
                } else {
                    right = mid;
                }
            }

            if (S[left] == T[i]) ans++;
            if (S[right] == T[i]) ans++;
        }

        System.out.println(ans);
    }
}