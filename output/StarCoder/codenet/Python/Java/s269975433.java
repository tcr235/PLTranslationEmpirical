import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int Q = scanner.nextInt();

        List<int[]> qGroups = new ArrayList<>();
        for (int i = 0; i < Q; i++) {
            int[] group = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
            qGroups.add(group);
        }

        int maxScore = 0;
        for (int[] p : CombinationsCombinations.combinationsWithReplacement(M, N)) {
            int tempScore = 0;
            for (int[] q : qGroups) {
                if (p[q[1] - 1] - p[q[0] - 1] == q[2]) {
                    tempScore += q[3];
                }
            }
            maxScore = Math.max(maxScore, tempScore);
        }

        System.out.println(maxScore);
    }
}

class CombinationsCombinations {
    public static List<int[]> combinationsWithReplacement(int n, int k) {
        List<int[]> result = new ArrayList<>();
        combinationWithReplacementHelper(result, new int[k], n, k, 0, 0);
        return result;
    }

    private static void combinationWithReplacementHelper(List<int[]> result, int[] data, int n, int k, int start, int index) {
        if (index == k) {
            result.add(data.clone());
            return;
        }
        for (int i = start; i <= n - k + index + 1; i++) {
            data[index] = i + 1;
            combinationWithReplacementHelper(result, data, n, k, i, index + 1);
        }
    }
}