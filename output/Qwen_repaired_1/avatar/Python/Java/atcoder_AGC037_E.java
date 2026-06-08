import java.util.Scanner;

public class atcoder_AGC037_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), k = scanner.nextInt();
        String s = scanner.next();
        boolean flag = false;
        if (k >= 15) flag = true;
        else if (Math.pow(2, k) >= n) flag = true;
        if (flag) System.out.println(repeatString(findMinCharacter(s), n));
        else {
            String result = reverseAndCombine(s);
            int count = countInitialCharacters(result, s.charAt(0));
            if (count * Math.pow(2, k - 1) >= n) System.out.println(repeatString(s.charAt(0), n));
            else {
                StringBuilder sb = new StringBuilder();
                int repeatCount = count * ((int)Math.pow(2, k - 1)) - 1;
                for (int i = 0; i < repeatCount; i++) {
                    sb.append(s.charAt(0));
                }
                sb.append(result);
                System.out.println(sb.toString().substring(0, n));
            }
        }
        scanner.close();
    }

    private static String repeatString(char c, int times) {
        return String.valueOf(c).repeat(times);
    }

    private static String reverseAndCombine(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        return s + reversed;
    }

    private static char findMinCharacter(String s) {
        return s.chars().min().orElse('a');
    }

    private static int countInitialCharacters(String result, char firstChar) {
        int count = 0;
        for (char c : result.toCharArray()) {
            if (c != firstChar) break;
            count++;
        }
        return count;
    }

    private static boolean checkNormalDict(String u, int pointer1, int pointer2) {
        for (int i = 0; i < Math.min(u.length() / 2, u.length() - 2); i++) {
            if (u.charAt(pointer1 + i) > u.charAt(pointer2 + i)) return true;
            else if (u.charAt(pointer1 + i) < u.charAt(pointer2 + i)) return false;
        }
        return false;
    }
}