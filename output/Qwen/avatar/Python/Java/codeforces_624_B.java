import java.util.*;

public class codeforces_624_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> a = Arrays.asList(scanner.nextLine().split(" "))
                                   .stream()
                                   .map(Integer::parseInt)
                                   .collect(Collectors.toList());
        a.sort(Collections.reverseOrder());
        long ans = 0;
        double pre = Double.POSITIVE_INFINITY;
        for (int j : a) {
            ans += Math.max(0, Math.min((int)pre - 1, j));
            pre = Math.max(0, Math.min((int)pre - 1, j));
        }
        System.out.println(ans);
        scanner.close();
    }
}