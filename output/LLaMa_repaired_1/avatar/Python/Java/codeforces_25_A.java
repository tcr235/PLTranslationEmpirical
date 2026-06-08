import java.util.Scanner;

public class codeforces_25_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        String[] input = scanner.nextLine().split(" ");
        int[] list = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            list[i] = Integer.parseInt(input[i]) % 2;
        }

        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }

        if (sum == 1) {
            for (int i = 0; i < list.length; i++) {
                if (list[i] == 1) {
                    System.out.println(i + 1);
                    break;
                }
            }
        } else {
            for (int i = 0; i < list.length; i++) {
                if (list[i] == 0) {
                    System.out.println(i + 1);
                    break;
                }
            }
        }
    }
}