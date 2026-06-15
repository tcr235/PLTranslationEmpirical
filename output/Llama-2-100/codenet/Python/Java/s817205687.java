import java.util.ArrayList;
import java.util.List;

public class s817205687 {
    public static void main(String[] args) {
        int n, m;
        n = Integer.parseInt(args[0]);
        m = Integer.parseInt(args[1]);
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(Integer.parseInt(args[i + 2]));
        }
        // 最初、Aの要素は全て偶数。2で割ったものに置き換え
        List<Integer> a2 = new ArrayList<>();
        for (int a : a) {
            a2.add(a / 2);
        }
        // 全ての要素について、2で割れる回数が同じでないと題意は満たせない
        int countDiv2 = 0;
        for (int a : a2) {
            int cnt = 0;
            while (a % 2 == 0) {
                a /= 2;
                cnt++;
            }
            if (countDiv2 == null) {
                countDiv2 = cnt;
            } else if (cnt != countDiv2) {
                System.out.println(0);
                return;
            }
        }
        // my_lcm = Aの全要素の最小公倍数。この奇数倍が題意を満たす。
        // my_lcmがMを超えていたら1つも作れない
        int myLcm = lcm(a2);
        if (myLcm > m) {
            System.out.println(0);
            return;
        }
        int tmp = m / myLcm;
        // my_lcmの1,2,...M倍まで使えるが、偶数は使えない
        int ans = (tmp + 1) / 2;
        System.out.println(ans);
    }
}
