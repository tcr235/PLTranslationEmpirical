import java.util.Scanner;

public class codeforces_55_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numsArr = scanner.nextLine().split(" ");
        String[] operationsArr = scanner.nextLine().split(" ");
        
        int[] nums = new int[numsArr.length];
        for (int i = 0; i < numsArr.length; i++) {
            nums[i] = Integer.parseInt(numsArr[i]);
        }
        
        String[] operations = new String[operationsArr.length];
        for (int i = 0; i < operationsArr.length; i++) {
            operations[i] = operationsArr[i];
        }
        
        long[] ans = { Long.MAX_VALUE };
        rememberTheNumber(nums, 0, operations, ans);
        System.out.println(ans[0]);
    }

    public static void rememberTheNumber(int[] nums, int i, String[] operations, long[] ans) {
        if (i >= operations.length) {
            return;
        }
        for (int j = 0; j < 4; j++) {
            for (int k = j + 1; k < 4; k++) {
                if (nums[j] != -1 && nums[k] != -1) {
                    int tempJ = nums[j];
                    int tempK = nums[k];

                    nums[j] = -1;
                    if (operations[i].equals("+")) {
                        nums[k] = tempJ + tempK;
                    } else if (operations[i].equals("*")) {
                        nums[k] = tempJ * tempK;
                    }

                    if (i == operations.length - 1 && nums[k] < ans[0]) {
                        ans[0] = nums[k];
                    }

                    rememberTheNumber(nums, i + 1, operations, ans);

                    nums[j] = tempJ;
                    nums[k] = tempK;
                }
            }
        }
    }
}