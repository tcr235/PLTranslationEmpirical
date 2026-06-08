import java.util.Scanner;

public class s039768540 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x = scanner.nextInt();
        scanner.close();
        int threeCount = Math.max(0, x / 100);
        System.out.println("ai1333" + repeat("3", threeCount));
    }

    public static String repeat(String str, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}