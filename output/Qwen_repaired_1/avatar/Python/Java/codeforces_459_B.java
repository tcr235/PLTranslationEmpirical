import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class codeforces_459_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> l1 = Arrays.stream(scanner.nextLine().split(" "))
                                .map(Integer::parseInt)
                                .collect(Collectors.toList());
        
        Collections.sort(l1);
        
        int a = l1.get(n - 1);
        int b = l1.get(0);
        
        if (a == b) {
            System.out.println(a - b + " " + (long)n * (n - 1) / 2);
        } else {
            Map<Integer, Long> countMap = new HashMap<>();
            for (int num : l1) {
                countMap.put(num, countMap.getOrDefault(num, 0L) + 1);
            }
            
            long ac = countMap.get(a);
            long bc = countMap.get(b);
            
            System.out.println(a - b + " " + ac * bc);
        }
    }
}