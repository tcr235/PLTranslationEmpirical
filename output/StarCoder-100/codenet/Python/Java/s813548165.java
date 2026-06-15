import java.util.*;

public class s813548165 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        String T = sc.next();

        List<String> char_lists = new ArrayList<String>();

        for (int i = 0; i < S.length(); i++) {
            char_lists.add(S.charAt(i) + "");
            char_lists.add(T.charAt(i) + "");
        }

        System.out.println(String.join("", char_lists));
    }
}
