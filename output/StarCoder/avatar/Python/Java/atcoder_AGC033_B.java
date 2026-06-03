```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int N = scanner.nextInt();
        int s_r = scanner.nextInt() - 1;
        int s_c = scanner.nextInt() - 1;
        
        int[] S = new int[N];
        for (int i = 0; i < N; i++) {
            S[i] = scanner.next().charAt(0);
        }
        
        int[] T = new int[N];
        for (int i = 0; i < N; i++) {
            T[i] = scanner.next().charAt(0);
        }
        
        boolean judge = false;
        int S_L = 0, S_R = 0, S_U = 0, S_D = 0;
        int T_L = 0, T_R = 0, T_U = 0, T_D = 0;
        
        for (int x = 0; x < N; x++) {
            if (S[x] == 'L') {
                S_L++;
                if (S_L - T_R - s_c == 0) {
                    judge = true;
                }
            } else if (S[x] == 'R') {
                S_R++;
                if (s_c + (S_R - T_L) == W + 1) {
                    judge = true;
                }
            } else if (S[x] == 'U') {
                S_U++;
                if (S_U - T_D - s_r == 0) {
                    judge = true;
                }
            } else if (S[x] == 'D') {
                S_D++;
                if (s_r + (S_D - T_U) == H + 1) {
                    judge = true;
                }
            }
            
            if (T[x] == 'L') {
                if (S_R - T_L + s_c != 1) {
                    T_L++;
                }
            } else if (T[x] == 'R') {
                if (s_c + (T_R - S_L) != W) {
                    T_R++;
                }
            } else if (T[x] == 'U') {
                if (S_D - T_U + s_r != 1) {
                    T_U++;
                }
            } else if (T[x