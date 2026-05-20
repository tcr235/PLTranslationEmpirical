import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine().toCharArray();
        Arrays.sort(s);

        String t = new StringBuilder(input.nextLine()).reverse().toString().toCharArray();
        Arrays.sort(t);

        int result = Arrays.compare(s, t);
        System.out.println(result == -1 ? "Yes" : "No");
        input.close();
    }
}