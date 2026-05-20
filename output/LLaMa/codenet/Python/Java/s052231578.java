import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = {111, 222, 333, 444, 555, 666, 777, 888, 999};
        Arrays.sort(arr);
        int idx = Arrays.binarySearch(arr, N);
        if (idx < 0) {
            idx = -idx - 1;
        }
        System.out.println(arr[idx]);
    }
}