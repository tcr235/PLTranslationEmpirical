import java.util.Scanner;

public class codeforces_379_A {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        String[] inputSplit = stdin.nextLine().split(" ");
        int candeleIntere = Integer.parseInt(inputSplit[0]);
        int b = Integer.parseInt(inputSplit[1]);
        int s = 0;
        int restoSciolte = 0;
        while (candeleIntere > 0 || restoSciolte >= b) {
            candeleIntere += restoSciolte / b;
            restoSciolte %= b;
            s += candeleIntere;
            restoSciolte += candeleIntere % b;
            candeleIntere /= b;
        }
        System.out.println(s);
        stdin.close();
    }
}