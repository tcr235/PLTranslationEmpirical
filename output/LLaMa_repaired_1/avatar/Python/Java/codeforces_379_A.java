import java.util.Scanner;

public class codeforces_379_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int candlesIntere = scanner.nextInt();
        int b = scanner.nextInt();
        int s = 0;
        int restoSciolte = 0;
        while (candlesIntere > 0 || restoSciolte >= b) {
            candlesIntere += restoSciolte / b;
            restoSciolte %= b;
            s += candlesIntere;
            restoSciolte += candlesIntere % b;
            candlesIntere /= b;
        }
        System.out.println(s);
    }
}