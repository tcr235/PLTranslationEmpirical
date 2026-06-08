import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class s087080706 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int x = scanner.nextInt();

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            int[] copy = Arrays.copyOf(a, a.length);
            Arrays.sort(copy);

            int i = findIndex(copy, x);
            System.out.println(Math.min(Arrays.binarySearch(a, 0, n, x) < 0 ? n : Arrays.binarySearch(a, 0, n, x) * -1,
                n - Arrays.binarySearch(a, 0, n, x) < 0 ? n : Arrays.binarySearch(a, 0, n, x) * -1));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        }
    }

    public static int findIndex(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
}