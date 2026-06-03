import java.util.Scanner;

public class codeforces_203_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int t = Integer.parseInt(input[1]);
        int a = Integer.parseInt(input[2]);
        int b = Integer.parseInt(input[3]);
        int da = Integer.parseInt(input[4]);
        int db = Integer.parseInt(input[5]);

        String result = checkResult(x, t, a, b, da, db);

        if ("Result Not Found".equals(result)) {
            System.out.println("NO");
        }
    }

    public static String checkResult(int x, int t, int a, int b, int da, int db) {
        if (x == 0) {
            System.out.println("YES");
            return "Result Found";
        }

        int aTime = Math.min(a / da, t - 1);
        int bTime = Math.min(b / db, t - 1);

        for (int i = 0; i <= aTime; i++) {
            for (int j = 0; j <= bTime; j++) {
                if ((a - da * i) == x || (b - db * j) == x) {
                    System.out.println("YES");
                    return "Result Found";
                }
                if ((a - da * i) + (b - db * j) == x) {
                    System.out.println("YES");
                    return "Result Found";
                }
            }
        }

        return "Result Not Found";
    }
}