import java.util.Scanner;
public class atcoder_ABC114_C {
    public static int aaa(int n) {
        int N = 100000;
        if (n > N) {
            return 0;
        }
        String strN = String.valueOf(n);
        Set<Character> set = new HashSet<>();
        set.add('7');
        set.add('5');
        set.add('3');
        int ans = 1;
        for (char i : '753') {
            ans += aaa(n + i);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = aaa(sc.nextInt());
        System.out.println(result);
    }
}


