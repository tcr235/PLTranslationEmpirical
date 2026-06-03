import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strValues = scanner.nextLine().split(" ");
        int[] A = new int[4];
        for (int i = 0; i < 4; i++) {
            A[i] = Integer.parseInt(strValues[i]);
        }
        if (A[1] <= A[2] || A[3] <= A[0]) {
            System.out.println(0);
        } else {
            Arrays.sort(A);
            System.out.println(A[2] - A[1]);
        }
    }
}