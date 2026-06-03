import java.util.Scanner;

public class codeforces_519_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline left-over

        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split(" ");
            a[i] = Integer.parseInt(line[0]);
            b[i] = Integer.parseInt(line[1]);
            c[i] = Integer.parseInt(line[2]);
        }

        int x = 0;
        int y = 0;
        int z = 0;

        for (int i = 0; i < n; i++) {
            x += a[i];
            y += b[i];
            z += c[i];
        }

        System.out.println(Math.abs(x - y));
        System.out.println(Math.abs(y - z));
    }
}