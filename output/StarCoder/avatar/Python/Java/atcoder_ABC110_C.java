import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class atcoder_ABC110_C {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        System.out.println(run(s, t));
    }

    public static String run(String s, String t) {
        Map<Character, Integer> counterS = countChars(s);
        Map<Character, Integer> counterT = countChars(t);

        int[] ss = new int[counterS.size()];
        int[] tt = new int[counterT.size()];

        int i = 0;
        for (Integer value : counterS.values()) {
            ss[i++] = value;
        }

        i = 0;
        for (Integer value : counterT.values()) {
            tt[i++] = value;
        }

        Arrays.sort(ss);
        Arrays.sort(tt);

        if (Arrays.equals(ss, tt)) {
            return "Yes";
        } else {
            return "No";
        }
    }

    private static Map<Character, Integer> countChars(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        return charCountMap;
    }
}