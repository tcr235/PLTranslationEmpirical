import java.util.Arrays;
import java.util.Scanner;

public class s214672212 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int[] nums = new int[inputs.length];
        for (int i = 0; i < inputs.length; i++) {
            nums[i] = Integer.parseInt(inputs[i]);
        }
        Arrays.sort(nums);
        int result = nums[0] * 10 + nums[1] + nums[2];
        System.out.println(result);
    }
}