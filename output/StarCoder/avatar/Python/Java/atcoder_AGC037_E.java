import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, k = scanner.nextInt();
        String s = scanner.next();
        boolean flag = false;
        if (k >= 15) flag = true;
        else if (Math.pow(2, k) >= n) flag = true;
        if (flag) System.out.println(minChar(s).repeat(n));
        else {
            String result = getLastDict(s);
            if (k == 1) System.out.println(result);
            else {
                int count = 0;
                char firstChar = result.charAt(0);
                for (char c : result.toCharArray()) {
                    if (c != firstChar) break;
                    count++;
                }
                if (count * Math.pow(2, k - 1) >= n) System.out.println(firstChar.repeat(n));
                else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(firstChar.repeat(count * ((int)Math.pow(2, k - 1)) - 1));
                    sb.append(result);
                    System.out.println(sb.substring(0, n));
                }
            }
        }
        scanner.close();
    }

    private static String getLastDict(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        String combined = s + reversed;
        char minChar = s.chars().min().orElse((char)0);
        int minIndex = combined.indexOf(minChar);
        int index = minIndex + 1;
        
        while (index <= s.length()) {
            if (combined.charAt(index) == minChar && checkNormalDict(combined, minIndex, index)) {
                minIndex = index;
            }
            index++;
        }
        return combined.substring(minIndex, minIndex + s.length());
    }

    private static boolean checkNormalDict(String u, int pointer1, int pointer2) {
        for (int i = 0; i < u.length() / 2; i++) {
            if (u.charAt(pointer1 + i) > u.charAt(pointer2 + i)) return true;
            else if (u.charAt(pointer1 + i) < u.charAt(pointer2 + i)) return false;
        }
        return false;
    }

    private static char minChar(String s) {
        return s.chars().min().orElse((char)0);
    }
}