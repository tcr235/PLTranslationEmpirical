import java.util.Scanner;
import java.util.Arrays;

public class codeforces_651_A {
    public static int num_inp(Scanner scanner) {
        return Integer.parseInt(scanner.nextLine());
    }

    public static int[] arr_inp(Scanner scanner) {
        String[] input = scanner.nextLine().split(" ");
        int[] array = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            array[i] = Integer.parseInt(input[i]);
        }
        return array;
    }

    public static int[] sp_inp(Scanner scanner) {
        String[] input = scanner.nextLine().split(" ");
        int[] array = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            array[i] = Integer.parseInt(input[i]);
        }
        return array;
    }

    public static String str_inp(Scanner scanner) {
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] xy = scanner.nextLine().split(" ");
        int x = Integer.parseInt(xy[0]);
        int y = Integer.parseInt(xy[1]);
        System.out.println(Math.max(x + y - 3 + ((y - x) % 3 > 0) ? 1 : 0, 0));
        // num_inp(scanner);
        // int num = num_inp(scanner);
        // int[] arr = arr_inp(scanner);
        // int[] sp = sp_inp(scanner);
        // String str = str_inp(scanner);
    }
}