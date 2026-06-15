import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Comparator;

public class s344468705 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> dp = new ArrayList<>();
        dp.add(-1);
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            num = -num;
            int idx = Collections.binarySearch(dp, num);
            if (idx < 0) {
                dp.add(num);
            } else {
                dp.set(idx, num);
            }
        }
        System.out.println(dp.size() - 1);
    }
}
