import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.close();
        
        int result = sumOfDigits(a);
        
        if (result == 1) {
            System.out.println(10);
        } else {
            System.out.println(result);
        }
    }
    
    public static int sumOfDigits(int a) {
        int result = 0;
        while (a != 0) {
            result += a % 10;
            a = a / 10;
        }
        return result;
    }
}