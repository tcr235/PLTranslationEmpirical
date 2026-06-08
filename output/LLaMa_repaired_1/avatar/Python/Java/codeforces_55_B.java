import java.util.Scanner;

public class codeforces_55_B {
    public static void rememberTheNumber(int[] nums, int i, char[] operations, long[] ans) {
        if (i >= 3) {
            return;
        }
        for (int j = 0; j < 4; j++) {
            for (int k = j + 1; k < 4; k++) {
                if (nums[j] != -1 && nums[k] != -1) {
                    int s = nums[j];
                    nums[j] = -1;
                    int t = nums[k];
                    if (operations[i] == '+') {
                        nums[k] = s + t;
                    } else if (operations[i] == '*') {
                        nums[k] = s * t;
                    }
                    if (i == 2 && nums[k] < ans[0]) {
                        ans[0] = nums[k];
                    }
                    rememberTheNumber(nums, i + 1, operations, ans);
                    nums[j] = s;
                    nums[k] = t;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[4];
        for (int i = 0; i < 4; i++) {
            nums[i] = scanner.nextInt();
        }
        scanner.nextLine();
        char[] operations = new char[3];
        for (int i = 0; i < 3; i++) {
            operations[i] = scanner.next().charAt(0);
        }
        long[] ans = new long[1];
        // Largest possible value that a long can hold is 9,223,372,036,854,775,807
        ans[0] = 9_223_372_036_854_775_807L;
        rememberTheNumber(nums, 0, operations, ans);
        System.out.println(ans[0]);
    }
}