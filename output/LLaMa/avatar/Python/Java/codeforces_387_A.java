import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input1 = scanner.nextLine().split(":");
        String[] input2 = scanner.nextLine().split(":");

        int h1 = Integer.parseInt(input1[0]);
        int m1 = Integer.parseInt(input1[1]);
        int h2 = Integer.parseInt(input2[0]);
        int m2 = Integer.parseInt(input2[1]);

        m1 += h1 * 60;
        m2 += h2 * 60;
        m2 = m1 - m2;
        m2 %= 1440;

        int hours = m2 / 60;
        int minutes = m2 % 60;

        System.out.printf("%02d:%02d%n", hours, minutes);
    }
}