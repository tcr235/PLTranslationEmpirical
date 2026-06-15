import java.util.Scanner;

public class atcoder_AGC037_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, k;
        n = scanner.nextInt();
        k = scanner.nextInt();
        String s = scanner.nextLine();
        boolean aaaa = false;
        if (k >= 15) {
            aaaa = true;
        } else if (2 << k >= n) {
            aaaa = true;
        }
        if (aaaa) {
            System.out.println(min(s) * n);
            return;
        }
        String lastDict = getLastDict(s);
        if (k == 1) {
            System.out.println(lastDict);
        } else {
            int count = 0;
            for (char c : lastDict) {
                if (c == lastDict.charAt(0)) {
                    count++;
                } else {
                    break;
                }
            }
            if (count * (2 << (k - 1)) >= n) {
                System.out.println(lastDict.charAt(0) * n);
            } else {
                lastDict = lastDict.substring(0, n);
                System.out.println(lastDict);
            }
        }
    }

    public static String getLastDict(String s) {
        String u = s + s.substring(0, s.length() - 1);
        int minindex = 0;
        for (int i = 1; i <= s.length(); i++) {
            if (u.charAt(i) == s.charAt(minindex)) {
                minindex = i;
            }
        }
        return u.substring(minindex, minindex + s.length());
    }

    public static boolean checkNormalDict(String u, int pointer1, int pointer2) {
        for (int i = 0; i < s.length(); i++) {
            if (u.charAt(pointer1 + i) > u.charAt(pointer2 + i)) {
                return true;
            } else if (u.charAt(pointer1 + i) < u.charAt(pointer2 + i)) {
                return false;
            }
        }
        return false;
    }
}
