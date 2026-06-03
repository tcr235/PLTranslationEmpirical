import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] xxs = scanner.nextLine().split(" ");
        int x = Integer.parseInt(xxs[0]);
        int t = Integer.parseInt(xxs[1]);
        int a = Integer.parseInt(xxs[2]);
        int b = Integer.parseInt(xxs[3]);
        int da = Integer.parseInt(xxs[4]);
        int db = Integer.parseInt(xxs[5]);
        System.out.println(resultFound(x, t, a, b, da, db));
    }

    public static String resultFound(int x, int t, int a, int b, int da, int db) {
        if (x == 0) {
            return "YES";
        }
        int aTime = Math.min(a / da, t - 1);
        int bTime = Math.min(b / db, t - 1);
        for (int i = 0; i <= aTime; i++) {
            for (int j = 0; j <= bTime; j++) {
                if (a - da * i == x || b - db * j == x) {
                    return "YES";
                }
                if ((a - da * i) + (b - db * j) == x) {
                    return "YES";
                }
            }
        }
        return "NO";
    }
}