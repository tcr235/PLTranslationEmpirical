import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        List<Integer> N_list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            N_list.add(i + 2);
        }
        
        List<List<Integer>> n = new ArrayList<>();
        generateCombinations(n, new ArrayList<>(), N_list, 3);
        
        int m = n.size();
        
        System.out.println(m);
        
        scanner.close();
    }

    private static void generateCombinations(List<List<Integer>> combinations, List<Integer> current, List<Integer> numbers, int k) {
        if (current.size() == k) {
            combinations.add(new ArrayList<>(current));
            return;
        }
        
        for (Integer number : numbers) {
            current.add(number);
            generateCombinations(combinations, current, numbers, k);
            current.remove(current.size() - 1);
        }
    }
}