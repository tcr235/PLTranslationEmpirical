import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class atcoder_AGC002_B {
    public static void main(String[] args) {
        int N, M;
        int INF = (int)1e9;
        int mod = (int)1e9 + 7;
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        N = sc.nextInt();
        M = sc.nextInt();
        int[] balls = new int[N];
        for (int i = 0; i < N; i++) {
            balls[i] = 1;
        }
        balls[0] = 0;

        for (int i = 0; i < M; i++) {
            int x, y, wx, ry, wy, rx;
            x = sc.nextInt();
            y = sc.nextInt();
            x--; y--;
            wx = balls[x];
            ry = balls[y];

            if (wx >= 1) {
                if (ry >= 1) {
                    balls[x]--;
                    balls[y]++;
                } else {
                    balls[x]--;
                    balls[y]++;
                    if (balls[y] == 1) {
                        balls[y] = 0;
                    }
                }
            } else {
                if (ry == 0) {
                    balls[x]++;
                    balls[y]--;
                    if (balls[y] == 1) {
                        balls[y] = 0;
                    }
                } else {
                    balls[x]++;
                    balls[y]--;
                }
            }
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (balls[i] == 1) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}