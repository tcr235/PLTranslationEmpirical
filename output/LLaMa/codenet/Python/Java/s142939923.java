import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        String[] inputs = scanner.nextLine().split(" ");
        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);

        int[] x = new int[3];

        x[0] = a + b;
        x[1] = a - b;
        x[2] = a * b;

        int result = findMax(x);
        System.out.println(result);
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}