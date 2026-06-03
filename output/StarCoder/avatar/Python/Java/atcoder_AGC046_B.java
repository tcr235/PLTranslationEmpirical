import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        long m = 998244353;
        long[][] d = new long[Integer.parseInt(inputs[0]) + 1][Integer.parseInt(inputs[1]) + 1];
        d[Integer.parseInt(inputs[0])][Integer.parseInt(inputs[1])] = 1;
        
        for (int i = Integer.parseInt(inputs[0]); i <= Integer.parseInt(inputs[2]); i++) {
            for (int j = Integer.parseInt(inputs[1]); j <= Integer.parseInt(inputs[3]); j++) {
                long sum = ((d[i][j - 1] * i + d[i - 1][j] * j - d[i - 1][j - 1] * (i - 1) * (j - 1)) % m + m) % m;
                d[i][j] = sum;
            }
        }

        System.out.println(d[Integer.parseInt(inputs[2])][Integer.parseInt(inputs[3])]);
    }
}