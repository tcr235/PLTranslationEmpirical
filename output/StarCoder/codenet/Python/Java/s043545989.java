import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Map<Integer, Integer> B = new HashMap<>();
        
        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            if (B.containsKey(num)) {
                B.put(num, B.get(num) + 1);
            } else {
                B.put(num, 1);
            }
        }
        
        int[] keys = new int[B.size()];
        int[] values = new int[B.size()];
        int index = 0;
        
        for (Map.Entry<Integer, Integer> entry : B.entrySet()) {
            keys[index] = entry.getKey();
            values[index++] = entry.getValue();
        }
        
        boolean isValid = false;
        
        if (keys.length == 3 && (keys[0] ^ keys[1] ^ keys[2]) == 0 && values[0] == values[1] && values[1] == values[2]) {
            isValid = true;
        } else if (keys.length == 2 && (keys[0] == 0 || keys[1] == 0) && Math.abs(values[0] - 2 * values[1]) == 0 || Math.abs(values[1] - 2 * values[0]) == 0) {
            isValid = true;
        } else if (keys.length == 1 && keys[0] == 0) {
            isValid = true;
        }
        
        System.out.println(isValid ? "Yes" : "No");
        
        scanner.close();
    }
}