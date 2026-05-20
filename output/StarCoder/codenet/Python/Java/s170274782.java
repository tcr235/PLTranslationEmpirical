import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        List<List<Integer>> A = new ArrayList<>();
        
        for (int i = 0; i < 2; i++) {
            String[] inputLine = scanner.nextLine().split("\\s+");
            List<Integer> list = new ArrayList<>();
            for (String s : inputLine) {
                list.add(Integer.parseInt(s));
            }
            A.add(list);
        }

        List<Integer> ans = new ArrayList<>();

        int count = 0;
        for (int i = 0; i < N; i++) {
            List<Integer> baselis = A.get(0);
            List<Integer> groundlis = A.get(1);
            count = 0;
            for (int j = 0; j <= i; j++) {
                count += baselis.get(j);
            }
            for (int k = i; k < N; k++) {
                count += groundlis.get(k);
            }
            ans.add(count);
        }

        System.out.println(Collections.max(ans));
    }
}