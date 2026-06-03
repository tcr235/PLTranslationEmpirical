import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        
        int sa = scanner.nextLine().replaceAll("-", "").length();
        sa = Math.min(n - sa, sa);
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            String[] edge = scanner.nextLine().split(" ");
            int a = Integer.parseInt(edge[0]);
            int b = Integer.parseInt(edge[1]) - a;
            
            if ((b % 2 != 0 && b <= sa << 1)) {
                sb.append("1\n");
            } else {
                sb.append("0\n");
            }
        }
        
        System.out.println(sb.toString());
    }
}