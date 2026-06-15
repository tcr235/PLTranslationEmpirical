import java.util.Scanner;

public class s537584449 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        int result = func(a);
        System.out.println(result);
    }

    public static int func(int a) {
        int digits = 0;
        int temp = a;
        while (temp != 0) {
            digits = (digits * 10) + (temp % 10);
            temp = temp / 10;
        }
        return digits;
    }
}
