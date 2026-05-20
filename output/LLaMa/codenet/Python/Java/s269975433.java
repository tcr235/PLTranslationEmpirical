```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());

        int[][] Q_groups = new int[Q][4];
        for (int i = 0; i < Q; i++) {
            st = new StringTokenizer(br.readLine());
            Q_groups[i][0] = 1;
            Q_groups[i][1] = Integer.parseInt(st.nextToken());
            Q_groups[i][2] = Integer.parseInt(st.nextToken());
            Q_groups[i][3] = Integer.parseInt(st.nextToken());
        }

        int max_score = 0;
        List<Integer> comb = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            comb.add(i + 1);
        }
        for (int i = 0; i < C(1, N, comb); i++) {
            List<Integer> current = new ArrayList<>(comb);
            for (int j = 0; j < N; j++) {
                current.set(j, current.get(j) - M + 1);
            }
            comb.clear();
            comb.addAll(current);
            int temp_score = 0;
            for (int j = 0; j < Q_groups.length; j++) {
                if (Q_groups[j][1] - Q_groups[j][0] == Q_groups[j][2] && Q_groups[j][0] <= comb.get(j + 1) && comb.get(j) <= Q_groups[j][1]) {
                    temp_score += Q_groups[j][3];
                }
            }
            max_score = Math.max(max_score, temp_score);
        }

        System.out.println(max_score);
    }

    public static int C(int r, int n, List<Integer> comb) {
        int count = 0;
        for (int i = 0; i <= n; i++) {
            int res = 1;
            int d = i;
            int u = r - i;
            for (int j : comb) {
                if (j <= i) {
                    d -= j;
                }
                if (j <= r) {
                    res *= r - (i - j) + 1;
                }
                if (j <= u) {