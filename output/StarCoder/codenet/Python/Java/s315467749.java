import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] S = Arrays.stream(scanner.nextLine().split()).mapToInt(Integer::parseInt).toArray();
        int q = scanner.nextInt();
        int[] T = Arrays.stream(scanner.nextLine().split()).mapToInt(Integer::parseInt).toArray();

        int ans = 0;
        for (int i : T) {
            if (i == S[n - 1] || i == S[0]) {
                ans++;
            } else {
                int left = 0;
                int right = n - 1;
                while (right - left > 1) {
                    int mid = (left + right) / 2;
                    if (S[mid] == i) {
                        ans++;
                        break;
                    } else if (S[mid] < i) {
                        left = mid;
                    } else {
                        right = mid;
                    }
                }
            }
        }

        System.out.println(ans);
        scanner.close();
    }
}