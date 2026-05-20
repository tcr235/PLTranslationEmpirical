import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int x = 1;

        int[] N_list = new int[N];
        for (int i = 0; i < N; i++) {
            N_list[i] = x + 1;
            x++;
        }

        List<int[]> combinations = new ArrayList<>();
        for (int one : N_list) {
            for (int two : N_list) {
                for (int three : N_list) {
                    combinations.add(new int[]{one, two, three});
                }
            }
        }

        int m = combinations.size();
        System.out.println(m);
    }
}