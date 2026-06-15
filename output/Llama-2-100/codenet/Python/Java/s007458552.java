import java.util.Scanner;

public class s007458552 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String S = sc.nextLine();
        Map<Character, Integer> C = new HashMap<>();
        for (String s : S.split("")) {
            C.put(s.charAt(0), C.getOrDefault(s.charAt(0), 0) + 1);
        }

        return "Yes" + (C.getOrDefault('R', 0) > n - C.getOrDefault('R', 0)) ? "" : "";
    }
}
