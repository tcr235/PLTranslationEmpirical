import java.util.Scanner;

public class s704354119 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] l = new String[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.next();
        }
        long max = Long.MIN_VALUE, min = Long.MAX_VALUE;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Long.parseLong(l[i]);
            if (max < Long.parseLong(l[i])) {
                max = Long.parseLong(l[i]);
            }
            if (min > Long.parseLong(l[i])) {
                min = Long.parseLong(l[i]);
            }
        }
        System.out.println(min + " " + max + " " + sum);
    }
}