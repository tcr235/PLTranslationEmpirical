import java.util.*;

public class Main {
    private static final long MOD = 1000000007;
    private static boolean showFlg = false;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        List<String> sList = new ArrayList<>();
        List<Integer> tList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String[] inputs = scanner.nextLine().split(" ");
            sList.add(inputs[0]);
            tList.add(Integer.parseInt(inputs[1]));
        }

        String X = scanner.nextLine();
        int xi = -1;

        for (int i = 0; i < N; i++) {
            if (sList.get(i).equals(X)) {
                xi = i;
                break;
            }
        }

        long ans = 0;

        for (int i = 0; i < N; i++) {
            if (xi < i) {
                ans += tList.get(i);
            }
        }

        System.out.println(ans);
    }
}