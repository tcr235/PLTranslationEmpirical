import java.util.Collections;
public class atcoder_ABC110_C {
    public static void main(String[] args) {
        String s = input();
        String t = input();
        List<String> ss = new ArrayList<String>(Collections.frequency(s.split(""),""));
        List<String> tt = new ArrayList<String>(Collections.frequency(t.split(""),""));
        if (ss.equals(tt)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}


