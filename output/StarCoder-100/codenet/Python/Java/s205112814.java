import java.util.*;

public class s205112814 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] gate_cond = new int[m];
        for (int i = 0; i < m; i++) {
            gate_cond[i] = sc.nextInt();
        }
        int max_under_th = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            max_under_th = Math.max(max_under_th, gate_cond[i][0]);
        }
        int min_upper_th = Integer.MAX_VALUE;
        for (int i = 0; i < m; i++) {
            min_upper_th = Math.min(min_upper_th, gate_cond[i][1]);
        }
        System.out.println(Math.max(0, min_upper_th - max_under_th + 1));
    }
}