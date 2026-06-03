import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String l = scanner.nextLine();
        String[] parts = l.split("\\.");
        char[] s_chars = parts[0].toCharArray();
        char[] p_chars = parts[1].toCharArray();
        int i = Integer.parseInt(String.valueOf(p_chars[0]));

        if (s_chars[s_chars.length - 1] == '9') {
            System.out.println("GOTO Vasilisa.");
        } else if (s_chars[s_chars.length - 1] != '9' && i < 5) {
            System.out.println(parts[0]);
        } else {
            StringBuilder sb = new StringBuilder(parts[0]);
            sb.setCharAt(sb.length() - 1, (char)(sb.charAt(sb.length() - 1) + 1));
            System.out.println(sb.toString());
        }
    }
}