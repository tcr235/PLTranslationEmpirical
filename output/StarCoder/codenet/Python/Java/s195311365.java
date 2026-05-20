import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        
        if (s.length() == 2) {
            System.out.println(s);
        } else {
            StringBuilder sb = new StringBuilder(s);
            sb.reverse();
            System.out.println(sb.toString());
        }
        
        scanner.close();
    }
}