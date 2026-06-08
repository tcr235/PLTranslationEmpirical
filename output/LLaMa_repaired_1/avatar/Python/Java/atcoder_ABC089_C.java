```java
import java.util.*;

public class atcoder_ABC089_C {
    static final long MOD = 1000000007;
    static final long INF = Long.MAX_VALUE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();

        String[] S = new String[N];
        for (int i = 0; i < N; i++) {
            S[i] = scanner.nextLine();
        }

        String[] march = {"M", "A", "R", "C", "H"};
        int[] marchLis = new int[5];

        for (String s : S) {
            if (s.length() > 0) {
                for (int i = 0; i < march.length; i++) {
                    if (s.trim().toUpperCase().charAt(0) == march[i].charAt(0)) {
                        marchLis[i]++;
                        break;
                    }
                }
            }
        }

        long ans = 0;
        for (int x : getCombinations(marchLis, 3)) {
            for (int y : getCombinations(marchLis, 2)) {
                for (int z : getCombinations(marchLis, 0)) {
                    if (getUniqueNums(x, y, z).length == 3) {
                        int valX = Arrays.stream(x).filter(num -> num != 0).findFirst().getAsInt();
                        int valY = Arrays.stream(y).filter(num -> num != 0).findFirst().getAsInt();
                        int valZ = Arrays.stream(z).filter(num -> num != 0).findFirst().getAsInt();
                        ans += (long) valX * valY * valZ;
                    }
                }
            }
        }

        System.out.println(ans);
    }

    public static int[] getCombinations(int[] array, int k) {
        ArrayList<Integer> rs = new ArrayList<Integer>();

        getCombinations(array, rs, 0, k);

        int[] result = new int[rs.size()];
        for (int i = 0; i < rs.size(); i++) {
            result[i] = rs.get(i);
        }

        return result;
    }

    public static void getCombinations(int[] array, ArrayList<Integer> rs, int start, int k) {
        if (k == 0) {
            rs.add(0);
            return;
        }

        for (