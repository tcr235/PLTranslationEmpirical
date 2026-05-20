import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];
        
        int x = 1, y = 1, z = 1;
        
        while (Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2) + x * y + y * z + z * x <= n) {
            while (Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2) + x * y + y * z + z * x <= n) {
                while (Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2) + x * y + y * z + z * x <= n) {
                    int i = (int) (Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2) + x * y + y * z + z * x);
                    if (i > 0 && i <= n) {
                        A[i - 1]++;
                    }
                    z++;
                }
                z = 1;
                y++;
            }
            y = 1;
            z = 1;
            x++;
        }
        
        for (int i = 0; i < n; i++) {
            System.out.println(A[i]);
        }
    }
}