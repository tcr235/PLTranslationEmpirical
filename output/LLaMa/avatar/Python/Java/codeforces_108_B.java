import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(s());
    }

    public static String s() {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        String[] inputArr = inputStr.split(" ");
        int[] a = new int[inputArr.length];
        for (int i = 0; i < inputArr.length; i++) {
            a[i] = Integer.parseInt(inputArr[i]);
        }
        Arrays.sort(a);
        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[i - 1] && a[i] < a[i - 1] * 2) {
                return "YES";
            }
        }
        return "NO";
    }
}