import java.util.Scanner;

public class codeforces_445_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] l = new String[n];
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            char[] arr = s.toCharArray();
            for (int j = 0; j < m; j++) {
                if (arr[j] == '.') {
                    if (i + j & 1 == 1) {
                        arr[j] = 'W';
                    } else {
                        arr[j] = 'B';
                    }
                }
            }
            l[i] = String.valueOf(arr);
        }
        for (String c : l) {
            System.out.print(c + " ");
        }
    }
}


