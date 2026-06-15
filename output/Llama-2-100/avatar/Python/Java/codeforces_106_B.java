import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class codeforces_106_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<List<Integer>> inputArray = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> currentItem = new ArrayList<>();
            currentItem.add(scanner.nextInt());
            currentItem.add(scanner.nextInt());
            currentItem.add(scanner.nextInt());
            currentItem.add(scanner.nextInt());
            inputArray.add(currentItem);
        }
        List<List<Integer>> outdated = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (inputArray[i].get(0) < inputArray[j].get(0) && inputArray[i].get(1) < inputArray[j].get(1) && inputArray[i].get(2) < inputArray[j].get(2)) {
                    outdated.add(inputArray[i]);
                }
            }
        }
        Set<List<Integer>> minimumCost = new HashSet<>();
        int minimumCostValue = 100000;
        for (int i = 0; i < n; i++) {
            List<Integer> currentItem = inputArray[i];
            int cost = currentItem.get(3);
            if (!outdated.contains(currentItem) && cost < minimumCostValue) {
                minimumCostValue = cost;
                int inputNumber = i + 1;
            }
        }
        System.out.println(inputNumber);
    }
}


