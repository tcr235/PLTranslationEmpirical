import java.util.*;

public class atcoder_ABC150_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String p = scanner.nextLine();
        String q = scanner.nextLine();

        int[][] origins = getPermutations(n);
        int pn = getPermutationIndex(p, origins);
        int qn = getPermutationIndex(q, origins);

        System.out.println(Math.abs(pn - qn));
    }

    private static int[][] getPermutations(int n) {
        int[][] permutations = new int[n][(int) Math.pow(n, n)];
        permute(new int[] {1}, 1, n, permutations, 0);
        return permutations;
    }

    private static void permute(int[] numbers, int k, int n, int[][] permutations, int index) {
        if (k == n) {
            for (int i = 0; i < n; i++) {
                permutations[i][index] = numbers[i];
            }
            index++;
            return;
        }
        for (int i = 1; i <= n; i++) {
            numbers[k] = i;
            permute(numbers, k + 1, n, permutations, index);
        }
    }

    private static int getPermutationIndex(String permutation, int[][] permutations) {
        int pInt[] = parsePermutation(permutation);
        for (int i = 0; i < permutations[0].length; i++) {
            boolean isSame = true;
            for (int j = 0; j < permutation.length(); j++) {
                if (pInt[j] != permutations[j][i]) {
                    isSame = false;
                    break;
                }
            }
            if (isSame) {
                return i;
            }
        }
        return -1;
    }

    private static int[] parsePermutation(String permutation) {
        int[] array = new int[permutation.length()];
        String[] elements = permutation.split(" ");
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(elements[i]);
        }
        return array;
    }
}