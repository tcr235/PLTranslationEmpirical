import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            l[i] = scanner.nextInt();
        }

        int ans = n - 1;
        int last = 0;
        for (int i = 0; i < n; i++) {
            ans += Math.abs(last - l[i]) + 1;
            last = l[i];
        }

        System.out.println(ans);
    }
}