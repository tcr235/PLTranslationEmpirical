import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] chars = s.toCharArray();
        
        long m = 1, mod = 0;
        int[] countRemainder = new int[2019];
        int cnt = 0;
        for (int i = 0; i < chars.length; i++) {
            mod += (chars[chars.length - i - 1] - '0') * m;
            
            mod %= 2019;
            m *= 10;
            m %= 2019;
            
            countRemainder[(int) mod]++;
        }
        countRemainder[0]++;
        
        for (int i = 0; i < 2019; i++) {
            cnt += countRemainder[i] * (countRemainder[i] - 1) / 2;
        }
        
        System.out.println(cnt);
    }
}