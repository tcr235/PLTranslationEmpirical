import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline left-over

        String s = scanner.nextLine();
        String t = scanner.nextLine();

        StringBuilder charList = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            charList.append(s.charAt(i));
            charList.append(t.charAt(i));
        }

        System.out.println(charList.toString());
    }
}