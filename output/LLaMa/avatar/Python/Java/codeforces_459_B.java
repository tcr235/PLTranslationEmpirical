import java.util.Arrays;
import java.util.Scanner;

public class codeforces_459_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        
        String[] input = scanner.nextLine().split(" ");
        int[] l1 = new int[input.length];
        for(int i = 0; i < input.length; i++) {
            l1[i] = Integer.parseInt(input[i]);
        }
        
        Arrays.sort(l1);
        
        int a = l1[l1.length - 1];
        int b = l1[0];
        
        if(a == b) {
            System.out.println(a - b + " " + (n * (n - 1)) / 2);
        } else {
            int ac = 0;
            int bc = 0;
            for(int i = 0; i < l1.length; i++) {
                if(l1[i] == a) {
                    ac++;
                } else if(l1[i] == b) {
                    bc++;
                }
            }
            System.out.println(a - b + " " + ac * bc);
        }
        
        scanner.close();
    }
}