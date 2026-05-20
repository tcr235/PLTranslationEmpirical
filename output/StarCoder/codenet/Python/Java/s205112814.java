import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[][] gateCond = new int[m][2];
        for (int i = 0; i < m; i++) {
            gateCond[i][0] = sc.nextInt();
            gateCond[i][1] = sc.nextInt();
        }
        
        int maxUnderTh = Integer.MIN_VALUE;
        for (int i = 0; i < gateCond.length; i++) {
            if (gateCond[i][0] > maxUnderTh) {
                maxUnderTh = gateCond[i][0];
            }
        }
        
        int minUpperTh = Integer.MAX_VALUE;
        for (int i = 0; i < gateCond.length; i++) {
            if (gateCond[i][1] < minUpperTh) {
                minUpperTh = gateCond[i][1];
            }
        }
        
        if (minUpperTh - maxUnderTh >= 0) {
            System.out.println(minUpperTh - maxUnderTh + 1);
        } else {
            System.out.println(0);
        }
        
        sc.close();
    }
}