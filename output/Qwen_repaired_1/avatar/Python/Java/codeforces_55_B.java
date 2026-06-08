import java.util.Scanner;

public class codeforces_55_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String[] operations = Arrays.stream(scanner.nextLine().split(" ")).toArray();
        long[] ans = new long[]{Long.MAX_VALUE};
        rememberTheNumber(nums, 0, operations, ans);
        System.out.println(ans[0]);
    }

    public static void rememberTheNumber(int[] nums, int i, String[] operations, long[] ans) {
        if (i >= operations.length) {
            return;
        }
        for (int j = 0; j < nums.length; j++) {
            for (int k = j + 1; k < nums.length; k++) {
                if (nums[j] != -1 && nums[k] != -1) {
                    int tempJ = nums[j], tempK = nums[k];
                    nums[j] = -1;
                    switch (operations[i]) {
                        case "+":
                            nums[k] = tempJ + tempK;
                            break;
                        case "*":
                            nums[k] = tempJ * tempK;
                            break;
                    }
                    if (i == operations.length - 1 && Math.abs((long) nums[k]) < ans[0]) {
                        ans[0] = Math.abs((long) nums[k]);
                    }
                    rememberTheNumber(nums, i + 1, operations, ans);
                    nums[j] = tempJ;
                    nums[k] = tempK;
                }
            }
        }
    }
}