import java.util.Arrays;
import java.util.Scanner;

public class codeforces_108_B {
    public static void main(String[] args) {
        System.out.println(s());
    }

    public static String s() {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();
        String[] inputArr = inputStr.split(" ");
        int[] a = new int[inputArr.length];
        if(inputArr.length < 2){
            return "NO";
        }
        for (int i = 0; i < inputArr.length; i++) {
            a[i] = Integer.parseInt(inputArr[i]);
        }
        Arrays.sort(a);
        for (int i = 1; i < a.length; i++) {
            if (a[i] <= a[i - 1] * 2 && a[i] != a[i - 1]) {
                return "YES";
            }
        }
        return "NO";
    }
}