import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        int n = Integer.parseInt(parts[0]);
        int k = Integer.parseInt(parts[1]);
        System.out.println(k % n == 0 ? n + k : k - n);
    }
}