import java.util.Scanner;

public class codeforces_99_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split("\\.");
        String s = parts[0];
        if (s.contains("9")) {
            String[] newParts = s.split("9");
            String lastPart = newParts[newParts.length - 1];
            String firstPart = newParts[newParts.length - 2];
            if (firstPart.isEmpty() || firstPart.charAt(0) == '9') {
                System.out.println("GOTO Vasilisa.");
            } else {
                int num = Integer.parseInt(firstPart) + 1;
                System.out.println(num);
            }
        } else {
            System.out.println(s);
        }
    }
}