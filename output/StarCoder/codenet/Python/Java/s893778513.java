import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        
        sc.close();
        
        int b = findMax(l);
        int s = findSum(l);
        
        if (b < s - b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static int findMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    private static int findSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
}