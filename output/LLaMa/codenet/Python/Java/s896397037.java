import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        if (arr[0] == arr[1] && arr[0] != arr[2] && arr[2] == arr[3]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}