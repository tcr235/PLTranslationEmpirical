import java.util.Scanner;

public class atcoder_AGC033_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[] S = sc.next().toCharArray();
        char[] T = sc.next().toCharArray();
        int[] S_L = new int[N];
        int[] S_R = new int[N];
        int[] S_U = new int[N];
        int[] S_D = new int[N];
        int[] T_L = new int[N];
        int[] T_R = new int[N];
        int[] T_U = new int[N];
        int[] T_D = new int[N];
        boolean Judge = false;
        for (int i = 0; i < N; i++) {
            if (S[i] == 'L') {
                S_L[i] = 1;
                if (S_L[i] - T_R[i] - S[i] == 0) {
                    Judge = true;
                }
            } else if (S[i] == 'R') {
                S_R[i] = 1;
                if (S_R[i] + (T_L[i] - S[i]) == W + 1) {
                    Judge = true;
                }
            } else if (S[i] == 'U') {
                S_U[i] = 1;
                if (S_U[i] - T_D[i] - S[i] == 0) {
                    Judge = true;
                }
            } else if (S[i] == 'D') {
                S_D[i] = 1;
                if (S_D[i] + (T_D[i] - S[i]) == H + 1) {
                    Judge = true;
                }
            }
            if (T[i] == 'L') {
                if (S_R[i] - T_L[i] + S[i] != 1) {
                    T_L[i]++;
                }
            } else if (T[i] == 'R') {
                if (S_R[i] + (T_R[i] - S[i]) != W) {
                    T_R[i]++;
                }
            } else if (T[i] == 'U') {
                if (S_U[i] - T_U[i] + S[i] != 1) {
                    T_U[i]++;
                }
            } else if (T[i] == 'D') {
                if (S_D[i] + (T_D[i] - S[i]) != H) {
                    T_D[i]++;
                }
            }
        }
        if (Judge) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}


