import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = scanner.nextInt();
        }
        Arrays.sort(l);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int a = l[i];
                int b = l[j];
                int right = bisectLeft(l, a + b, i, j);
                int left = bisectRight(l, Math.max(a - b, b - a), i, j);
                int tmp = Math.max(0, right - left);
                if (left <= i && i < right) {
                    tmp -= 1;
                }
                if (left <= j && j < right) {
                    tmp -= 1;
                }
                ans += tmp;
            }
        }
        System.out.println(ans / 3);
    }

    public static int bisectLeft(int[] arr, int key, int l, int r) {
        int left = l;
        int right = r;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public static int bisectRight(int[] arr, int key, int l, int r) {
        int left = l;
        int right = r;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > key) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}