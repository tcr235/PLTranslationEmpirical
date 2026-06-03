import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<List<Integer>> originalPermutations = new ArrayList<>();
        
        permute(new ArrayList<>(List.of(1)), originalPermutations, n);
        
        String[] pString = scanner.nextLine().split(" ");
        String[] qString = scanner.nextLine().split(" ");
        
        int pn = -1, qn = -1;
        
        for (int i = 0; i < originalPermutations.size(); i++) {
            if (originalPermutations.get(i).equals(Arrays.asList(Integer.parseInt(pString[0]), Arrays.asList(Integer.parseInt(pString[1]), Arrays.asList(Integer.parseInt(pString[2]))))) {
                pn = i;
                break;
            }
        }
        
        for (int i = 0; i < originalPermutations.size(); i++) {
            if (originalPermutations.get(i).equals(Arrays.asList(Integer.parseInt(qString[0]), Arrays.asList(Integer.parseInt(qString[1]), Arrays.asList(Integer.parseInt(qString[2]))))) {
                qn = i;
                break;
            }
        }
        
        System.out.println(Math.abs(pn - qn));
    }

    private static void permute(List<Integer> current, List<List<Integer>> result, int n) {
        if (current.size() == n) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (!current.contains(i)) {
                current.add(i);
                permute(current, result, n);
                current.remove(current.size() - 1);
            }
        }
    }
}