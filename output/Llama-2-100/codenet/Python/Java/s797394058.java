import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class s797394058 {

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int x = 1;

        List<Integer> N_list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            N_list.add(x + 1);
        }

        List<List<Integer>> n = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                list.add(N_list.get(i));
            }
            n.add(list);
        }

        int m = n.size();

        System.out.println(m);
    }
}
