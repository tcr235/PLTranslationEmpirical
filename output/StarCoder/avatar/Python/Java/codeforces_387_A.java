import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parts1 = scanner.next().split(":");
        int h1 = Integer.parseInt(parts1[0]);
        int m1 = Integer.parseInt(parts1[1]);
        m1 += h1 * 60;
        
        String[] parts2 = scanner.next().split(":");
        int h2 = Integer.parseInt(parts2[0]);
        int m2 = Integer.parseInt(parts2[1]);
        m2 += h2 * 60;
        
        m2 = m1 - m2;
        m2 %= 1440;
        
        System.out.printf("%02d:%02d\n", m2 / 60, m2 % 60);
        
        scanner.close();
    }
}