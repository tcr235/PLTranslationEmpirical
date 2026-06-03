import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC171_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstLine = scanner.nextLine();
        String[] parts = firstLine.split(" ");
        int n = Integer.parseInt(parts[0]);
        int k = Integer.parseInt(parts[1]);

        String secondLine = scanner.nextLine();
        parts = secondLine.split(" ");
        int[] numbers = Arrays.stream(parts)
                                .mapToInt(Integer::parseInt)
                                .toArray();

        Arrays.sort(numbers);

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += numbers[i];
        }

        System.out.println(sum);
        scanner.close();
    }
}