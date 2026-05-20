import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int t = scanner.nextInt();

        int answer;
        if (X > t) {
            answer = X - t;
        } else {
            answer = 0;
        }

        System.out.println(answer);
        scanner.close();
    }
}