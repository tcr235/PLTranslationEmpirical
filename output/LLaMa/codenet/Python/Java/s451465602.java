import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int h = n / 3600;
        int remainder = n % 3600;
        int m = remainder / 60;
        int s = remainder % 60;

        System.out.println(String.format("%d:%d:%d", h, m, s));
    }
}