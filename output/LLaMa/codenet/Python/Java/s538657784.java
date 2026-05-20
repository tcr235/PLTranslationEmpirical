import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        double sqN = Math.sqrt(N);
        int intSqN = (int)sqN;

        for (int i = 1; i <= intSqN; i++) {
            if (N % (intSqN - i) == 0) {
                System.out.println(intSqN + intSqN - N / (intSqN - i));
                break;
            }
        }
    }
}