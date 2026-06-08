import java.util.Scanner;

public class codeforces_519_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] splitA = scanner.nextLine().split(" ");
        String[] splitB = scanner.nextLine().split(" ");
        String[] splitC = scanner.nextLine().split(" ");

        int x = 0;
        int y = 0;
        int z = 0;

        for (String s : splitA) {
            x += Integer.parseInt(s);
        }

        for (String s : splitB) {
            y += Integer.parseInt(s);
        }

        for (String s : splitC) {
            z += Integer.parseInt(s);
        }

        System.out.println(Math.abs(x - y));
        System.out.println(Math.abs(y - z));
        scanner.close();
    }
}