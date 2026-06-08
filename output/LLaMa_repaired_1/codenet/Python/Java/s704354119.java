import java.util.Scanner;

public class s704354119 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of integers: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // to consume newline left-over

        System.out.print("Enter integers separated by space: ");
        String[] str = scanner.nextLine().split(" ");
        int[] l = new int[n];

        for (int i = 0; i < n; i++) {
            l[i] = Integer.parseInt(str[i]);
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += l[i];
            if (l[i] > max) {
                max = l[i];
            }
            if (l[i] < min) {
                min = l[i];
            }
        }

        System.out.println(min);
        System.out.println(max);
        System.out.println(sum);
    }
}