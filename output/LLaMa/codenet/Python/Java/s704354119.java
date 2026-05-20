import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of integers: ");
        int n = scanner.nextInt();

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
            max = Math.max(max, l[i]);
            min = Math.min(min, l[i]);
        }

        System.out.println("Minimum: "+min);
        System.out.println("Maximum: "+max);
        System.out.println("Sum: "+sum);
    }
}