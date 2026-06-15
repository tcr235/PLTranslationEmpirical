import java.util.*;

public class s797394058 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = 1;

        List<Integer> N_list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            N_list.add(x+1);
            x++;
        }

        List<List<Integer>> n = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    n.add(Arrays.asList(N_list.get(i), N_list.get(j), N_list.get(k)));
                }
            }
        }

        System.out.println(n.size());
    }
}

