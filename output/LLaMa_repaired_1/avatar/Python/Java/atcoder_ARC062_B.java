import java.util.Scanner;

public class atcoder_ARC062_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int numG = Integer.parseInt(input[0]);
        int numP = Integer.parseInt(input[1]);
        int score = 0;
        score = Math.min(numG, numP) + Math.abs(numG - numP) / 2;
        System.out.println(score);
    }
}