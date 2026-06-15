import java.util.Scanner;

public class s214672212 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nums = sc.nextLine().split(" ");
        int[] nums_int = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            nums_int[i] = Integer.parseInt(nums[i]);
        }
        Arrays.sort(nums_int);
        System.out.println(nums_int[0] * 10 + nums_int[1] + nums_int[2]);
    }
}
