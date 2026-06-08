import java.util.Scanner;

public class s251858505 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();
        
        System.out.println(countEqualCharacters(str1, str2));
    }

    public static int countEqualCharacters(String s1, String s2) {
        if (s1.length() != s2.length()) {
            throw new RuntimeException("Strings must be of the same length");
        }
        int result = 0;
        for (int i = 0; i < s1.length(); i++) {
            result += s1.charAt(i) == s2.charAt(i) ? 1 : 0;
        }
        return result;
    }
}