import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input1 = scanner.nextLine().split(" ");
        String[] input2 = scanner.nextLine().split(" ");
        
        int n = Integer.parseInt(input1[0]);
        int k = Integer.parseInt(input1[1]);
        
        int[] array = new int[input2.length];
        for (int i = 0; i < input2.length; i++) {
            array[i] = Integer.parseInt(input2[i]);
        }
        
        Arrays.sort(array);
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += array[i];
        }
        
        System.out.println(sum);
    }
}