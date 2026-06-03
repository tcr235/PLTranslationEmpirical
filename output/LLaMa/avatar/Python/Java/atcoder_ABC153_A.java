import java.util.Scanner;

public class atcoder_ABC153_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter h and a separated by space: ");
        String[] input = scanner.nextLine().split(" ");
        int h = Integer.parseInt(input[0]);
        int a = Integer.parseInt(input[1]);
        int sho = h / a;
        int am = h % a;
        if (am != 0) {
            sho++;
        }
        System.out.println(sho);
    }
}