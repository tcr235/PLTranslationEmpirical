import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = Arrays.stream(scanner.nextLine().split(" "))
                            .mapToInt(Integer::parseInt)
                            .toArray();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }
        System.out.println((nums[2]*10 + nums[1]) * 10 + nums[0]);
    }
}