import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class s269975433 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int Q = sc.nextInt();

        List<List<Integer>> Q_groups = new ArrayList<>();
        for (int i = 0; i < Q; i++) {
            List<Integer> group = new ArrayList<>();
            for (int j = 0; j < M; j++) {
                group.add(sc.nextInt());
            }
            Q_groups.add(group);
        }

        List<Integer> max_score = new ArrayList<>();
        for (int p = 1; p <= M; p++) {
            int temp_score = 0;
            for (List<Integer> q : Q_groups) {
                if (p == q.get(1) - q.get(0)) {
                    temp_score += q.get(3);
                }
            }
            max_score.add(temp_score);
        }

        Collections.sort(max_score, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        System.out.println(max_score.get(0));
    }
}
