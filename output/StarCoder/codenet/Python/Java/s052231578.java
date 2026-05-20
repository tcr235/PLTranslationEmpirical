import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = {111, 222, 333, 444, 555, 666, 777, 888, 999};
        Arrays.sort(arr);
        int ansIdx = Arrays.binarySearch(arr, N);
        if (ansIdx < 0) {
            ansIdx = -(ansIdx + 1);
        }
        System.out.println(ansIdx >= arr.length ? "No such element" : arr[ansIdx]);
    }
}