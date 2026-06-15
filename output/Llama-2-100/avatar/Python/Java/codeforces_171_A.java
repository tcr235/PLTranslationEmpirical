import java.util.Scanner;

public class codeforces_171_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int x = Math.max(a.length(), b.length());
        a = a.padStart(x, '0');
        b = b.padStart(x, '0');
        int c = 0;
        for (int i = 0; i < x; i++) {
            int d = Integer.parseInt(b[i]) + Integer.parseInt(a[x - i - 1]) + c;
            if (d > 9) {
                String temp = String.valueOf(d);
                if (temp.length() == 1) {
                    s += temp;
                } else {
                    s += "1" + temp.substring(1);
                }
                c = 1;
            } else {
                s += String.valueOf(d);
            }
        }
        if (c == 1) {
            s += "1";
        }
        System.out.println(Integer.parseInt(s.substring(0, s.length() - 1)));
    }
}


