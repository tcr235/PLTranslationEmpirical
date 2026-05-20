import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two integers");
        String[] input = scanner.nextLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int t = Integer.parseInt(input[1]);

        int answer = 0;
        if (x > t) {
            answer = x - t;
        }

        System.out.println(answer);
    }
}