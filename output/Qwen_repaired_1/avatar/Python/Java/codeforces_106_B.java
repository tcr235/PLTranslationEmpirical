import java.util.*;

public class codeforces_106_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<int[]> inputArray = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] parts = scanner.nextLine().split(" ");
            int s = Integer.parseInt(parts[0]);
            int r = Integer.parseInt(parts[1]);
            int h = Integer.parseInt(parts[2]);
            int c = Integer.parseInt(parts[3]);
            inputArray.add(new int[]{s, r, h, c});
        }
        List<int[]> outdated = new ArrayList<>();
        for (int i = 0; i < inputArray.size(); i++) {
            for (int j = i + 1; j < inputArray.size(); j++) {
                int[] item1 = inputArray.get(i);
                int[] item2 = inputArray.get(j);
                if (item1[0] < item2[0] && item1[1] < item2[1] && item1[2] < item2[2]) {
                    outdated.add(item1);
                }
            }
        }
        outdated.retainAll(inputArray);
        Collections.reverse(outdated);
        Comparator<int[]> comparator = Comparator.comparingInt(arr -> arr[3]).reversed();
        outdated.sort(comparator);
        int minimumCost = 100000;
        int inputNumber = 0;
        for (int i = 0; i < inputArray.size(); i++) {
            int[] currentItem = inputArray.get(i);
            int cost = currentItem[3];
            if (!outdated.contains(currentItem) && cost < minimumCost) {
                minimumCost = cost;
                inputNumber = i + 1;
            }
        }
        System.out.println(inputNumber);
    }
}