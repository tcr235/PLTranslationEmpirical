import java.util.Scanner;

public class s000375264 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int t = Integer.parseInt(input[1]);

        int answer = x >= t ? x - t : 0;
        
        System dụng.out.println(answer);
    }
}