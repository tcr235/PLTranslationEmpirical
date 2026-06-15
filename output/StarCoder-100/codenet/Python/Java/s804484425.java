import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.Scanner;

public class s804484425 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] info = new int[n][2];
        for (int i = 0; i < n; i++) {
            info[i][0] = sc.nextInt();
            info[i][1] = sc.nextInt();
        }
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>(new Comparator<int[]>(){
            public int compare(int[] a, int[] b) {
                return b[0] - a[0];
            }
        });
        for (int i = 0; i < k; i++) {
            pq.add(info[i]);
        }
        int cnt = 1;
        int sum = 0;
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            if (cur[0]!= cnt) {
                cnt++;
                sum += cur[1];
            }
        }
        System.out.println(cnt * cnt + sum);
    }
}

