import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();  // Consume newline left-over

        ArrayList<Integer[]> gates = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            gates.add(new Integer[]{scanner.nextInt(), scanner.nextInt()});
        }

        int maxUnderThreshold = Integer.MIN_VALUE;
        int minUpperThreshold = Integer.MAX_VALUE;
        for (Integer[] gate : gates) {
            maxUnderThreshold = Math.max(maxUnderThreshold, gate[0]);
            minUpperThreshold = Math.min(minUpperThreshold, gate[1]);
        }

        int range = Math.max(0, minUpperThreshold - maxUnderThreshold + 1);
        System.out.println(range);
    }
}