import java.util.Scanner;

public class atcoder_ABC139_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers separated by a space:");
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);

        long hole = 1;
        long i = 0;
        boolean check = true;
        i = 1;
        while (check) {
            if (hole >= b) {
                check = false;
            } else {
                hole = a * (i) - (i - 1);
                i += 1;
            }
        }
        System.out.println(i - 1);
    }
}