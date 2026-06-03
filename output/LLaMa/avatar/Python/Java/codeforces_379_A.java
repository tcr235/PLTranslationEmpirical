import java.util.Scanner;

public class codeforces_379_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two integers separated by space: ");
        String[] input = scanner.nextLine().split(" ");
        int candlesIntere = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int s = 0;
        int restoSciolte = 0;
        while (candlesIntere > 0 || restoSciolte >= b) {
            candlesIntere += restoSciolte / b;
            restoSciolte %= b;
            s += candlesIntere;
            restoSciolte += candlesIntere % b;
            if (b == 1) {
                break;
            }
            candlesIntere /= b;
        }
        System.out.println(s);
    }
}