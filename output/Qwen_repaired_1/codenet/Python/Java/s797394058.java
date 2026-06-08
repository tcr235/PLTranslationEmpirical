import java.util.Arrays;
import java.util.List;

public class s797394058 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        
        List<Integer> N_list = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10); // Assuming N <= 9
        
        List<int[]> n = new ArrayList<>();
        product(n, new int[3], N_list, 0, 3);
        
        int m = n.size();
        
        System.out.println(m);
        
        reader.close();
    }

    private static void product(List<int[]> result, int[] current, List<Integer> numbers, int start, int length) {
        if (index == length) {
            result.add(Arrays.copyOfRange(current, 0, index));
            return;
        }
        
        for (int i = start; i < numbers.size(); i++) {
            current[index] = numbers.get(i);
            product(result, current, numbers, i, length);
        }
    }
}