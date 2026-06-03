```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	static final int MOD = (int) (1e9 + 7);

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = (int) (1e6);
		int[][] fact = new int[(int) (1e3)][N];
		fact[0][0] = 1;
		for (int n = 1; n < (int) (1e3); n++) {
			for (int i = 0; i < N; i++) {
				fact[n][i] = fact[n - 1][i] * fact[n][i - 1] % MOD;
			}
		}
		for (int n = 1; n < (int) (1e3); n++) {
			for (int i = 0; i < N; i++) {
				fact[n][i] = fact[n][i] * fact[n - 1][i] % MOD;
			}
		}
		int[] inv = new int[N];
		for (int i = 0; i < N; i++) {
			inv[i] = pow(i + 1, MOD - 2, MOD);
		}
		for (int i = 1; i < N; i++) {
			inv[i] = (inv[i] + inv[i - 1]) % MOD;
		}
		int[] j = new int[N];
		for (int i = 0; i < N; i++) {
			j[i] = i;
		}
		int[] temp = new int[N];
		for (int i = 0; i < N; i++) {
			temp[i] = inv[j[i]] + inv[N - 1 - j[i]] - 1;
		}
		int ans = 0;
		for (int i = 0; i < N; i++) {
			ans = (int) (((long) A[i] * temp[i] % MOD + ans) % MOD);
		}
		ans = ans * fact[N]