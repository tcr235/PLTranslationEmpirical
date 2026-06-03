```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter four integers separated by space: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.nextLine();

        int[][] a = new int[x][y];
        int[][] b = new int[x][y];
        int[][] c = new int[z][1];

        System.out.print("Enter " + x + " rows of " + y + " integers separated by space for array a: ");
        for (int i = 0; i < x; i++) {
            String[] row = scanner.nextLine().split(" ");
            for (int j = 0; j < y; j++) {
                a[i][j] = Integer.parseInt(row[j]);
            }
        }

        System.out.print("Enter " + x + " rows of " + y + " integers separated by space for array b: ");
        for (int i = 0; i < x; i++) {
            String[] row = scanner.nextLine().split(" ");
            for (int j = 0; j < y; j++) {
                b[i][j] = Integer.parseInt(row[j]);
            }
        }

        System.out.print("Enter " + z + " integers separated by space for array c: ");
        String[] row = scanner.nextLine().split(" ");
        for (int i = 0; i < z; i++) {
            c[i][0] = Integer.parseInt(row[i]);
        }

        int[][] ab = new int[x * y][];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                ab[i * y + j] = new int[]{a[i][j] + b[i][j]};
            }
        }
        Arrays.sort(ab, (o1, o2) -> Integer.compare(o2[0], o1[0]));

        int[][] abc = new int[Math.min(k, x * y)][z];
        for (int i = 0; i < Math.min(k, x * y); i++) {
            for (int j = 0; j < z; j++) {
                abc[i][j] = ab[i][0] + c