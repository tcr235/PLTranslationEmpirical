```java
import java.util.Arrays;
import java.util.Scanner;

class atcoder_ABC123_D {
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
        int[] c = new int[z];

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
            c[i] = Integer.parseInt(row[i]);
        }

        int[] ab = new int[x * y];
        int index = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                ab[index++] = a[i][j] + b[i][j];
            }
        }
        Arrays.sort(ab);

        int[] abc = new int[Math.min(k, x * y)];
        index = Math.min(k, x * y) - 1;
        for (int i = 0; i < Math.min(k, x * y); i++) {
            for (int j = 0; j < z && c.length > j; j++) {
                abc[i] = ab[index--] + c[j];
            }
        }