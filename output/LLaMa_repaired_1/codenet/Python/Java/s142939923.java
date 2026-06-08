import java.util.Arrays;
import java.util.Scanner;

public class s142939923 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        String[] inputs = scanner.nextLine().split(" ");
        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);

        int[] x = new int[] {a + b, a - b, a * b};

        Arrays.sort(x);
        System.out.println(x[x.length - 1]);
    }
}