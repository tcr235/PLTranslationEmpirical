import java.util.Scanner;

public class s170274782 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<List<Integer>> A = new ArrayList<>();
        for (int _ = 0; _ < 2; _++) {
            List<Integer> s = new ArrayList<>();
            s.addAll(Arrays.asList(scanner.next().split(" ")));
            A.add(s);
        }

        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            List<Integer> baselis = A.get(0);
            List<Integer> groundlis = A.get(1);
            int count = 0;
            count += sum(baselis.subList(0, i + 1));
            count += sum(groundlis.subList(i, N + 1));
            ans.add(count);
        }

        int max = Collections.max(ans);
        System.out.println(max);
    }

    public static int sum(List<Integer> list) {
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        return sum;
    }
}
