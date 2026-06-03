import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        
        int mn = N + 1, mx = -1;
        for (int i = 0; i < N; i++) {
            if (i + 1 != A[i]) {
                mn = Math.min(mn, i);
                mx = Math.max(mx, i);
            }
        }

        if (mx == -1) {
            System.out.println("0 0");
        } else {
            int[] subArray = Arrays.copyOfRange(A, mn, mx + 1);
            reverse(subArray);
            
            System.arraycopy(subArray, 0, A, mn, subArray.length);

            if (isSorted(A)) {
                System.out.println((mn + 1) + " " + (mx + 1));
            } else {
                System.out.println("0 0");
            }
        }

        scanner.close();
    }

    private static boolean isSorted(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
        return true;
    }

    private static void reverse(int[] array) {
        for (int left = 0, right = array.length - 1; left < right; left++, right--) {
            int tempLeft = array[left];
            int tempRight = array[right];

            array[left] = tempRight;
            array[right] = tempLeft;
        }
    }
}