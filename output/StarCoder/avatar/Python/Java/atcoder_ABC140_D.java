import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        String S = scanner.next();
        int segCnt = 0;
        for (int i = 0; i < N - 1; i++) {
            if (!S.substring(i, i+1).equals(S.substring(i+1, i+2))) {
                segCnt++;
            }
        }
        int curHappy = N - 1 - segCnt;
        long MOD = (long) 1e9 + 7;
        long ans = 2 * K >= segCnt ? N - 1 : curHappy + 2 * K;
        System.out.println(ans);
    }
}