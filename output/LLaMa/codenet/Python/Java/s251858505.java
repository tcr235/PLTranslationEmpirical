import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();
        
        System.out.println(sum(map(str1, str2)));
    }

    public static int sum(bool b) {
        return b ? 1 : 0;
    }

    public static boolean[] map(String s1, String s2) {
        boolean[] result = new boolean[s1.length()];
        for (int i = 0; i < s1.length(); i++) {
            result[i] = s1.charAt(i) == s2.charAt(i);
        }
        return result;
    }
}