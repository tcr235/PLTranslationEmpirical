import java.util.Scanner;

public class s615966179 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(n / (a + b) * a + Math.min(n % (a + b), a));
    }
}