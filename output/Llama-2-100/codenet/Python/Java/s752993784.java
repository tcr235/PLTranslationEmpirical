import java.util.ArrayList;
import java.util.List;

public class s752993784 {
    public static void main(String[] args) {
        List<Integer> s = new ArrayList<>();
        List<Integer> countRemainder = new ArrayList<>();
        int cnt = 0;

        int m = 1;
        int mod = 0;
        for (int i = 0; i < s.size(); i++) {
            int temp = s.get(s.size() - i - 1);
            mod += temp * m;

            mod %= 2019;
            m *= 10;
            m %= 2019;

            countRemainder.add(mod);
        }

        countRemainder.add(0, 1);

        for (int i = 0; i < 2019; i++) {
            cnt += (countRemainder.get(i) * (countRemainder.get(i) - 1)) / 2;
        }

        System.out.println(cnt);
    }
}


