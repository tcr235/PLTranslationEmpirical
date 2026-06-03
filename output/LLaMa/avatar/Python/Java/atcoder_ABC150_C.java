import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        List<Integer> numbers = IntStream.range(1, n + 1).boxed().collect(Collectors.toList());
        List<List<Integer>> permutations = getPermutations(numbers);

        System.out.print("Enter the first permutation: ");
        String first = scanner.next();
        System.out.print("Enter the second permutation: ");
        String second = scanner.next();

        int pn = getPermutationNumber(permutations, Arrays.stream(first.split(" ")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList()));
        int qn = getPermutationNumber(permutations, Arrays.stream(second.split(" ")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList()));

        System.out.println(Math.abs(pn - qn));
    }

    private static List<List<Integer>> getPermutations(List<Integer> numbers) {
        List<List<Integer>> permutations = new ArrayList<>();
        permute(numbers, 0, numbers.size() - 1, permutations);
        return permutations;
    }

    private static void permute(List<Integer> numbers, int left, int right, List<List<Integer>> permutations) {
        if (left == right) {
            permutations.add(new ArrayList<>(numbers));
        } else {
            for (int i = left; i <= right; i++) {
                swap(numbers, left, i);
                permute(numbers, left + 1, right, permutations);
                swap(numbers, left, i);
            }
        }
    }

    private static void swap(List<Integer> numbers, int i, int j) {
        int temp = numbers.get(i);
        numbers.set(i, numbers.get(j));
        numbers.set(j, temp);
    }

    private static int getPermutationNumber(List<List<Integer>> permutations, List<Integer> permutation) {
        for (int i = 0; i < permutations.size(); i++) {
            if (permutations.get(i).equals(permutation)) {
                return i;
            }
        }
        return -1;
    }
}