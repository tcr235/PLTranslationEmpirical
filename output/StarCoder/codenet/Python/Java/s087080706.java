import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int x = scanner.nextInt();
        int[] a = new int[n];
        for (int k = 0; k < n; k++) {
            a[k] = scanner.nextInt();
        }
        Arrays.sort(a);
        int index = Arrays.binarySearch(a, x);
        if (index < 0) {
            index = -(index + 1);
        }
        System.out.println(Math.min(index, n - index));
    }
}