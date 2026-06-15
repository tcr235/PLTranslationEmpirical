public class codeforces_203_A {
    public static void main(String[] args) {
        String xxs = input().split(" ");
        int x, t, a, b, da, db;
        x = Integer.parseInt(xxs[0]);
        t = Integer.parseInt(xxs[1]);
        a = Integer.parseInt(xxs[2]);
        b = Integer.parseInt(xxs[3]);
        da = Integer.parseInt(xxs[4]);
        db = Integer.parseInt(xxs[5]);
        if (x == 0) {
            System.out.println("YES");
            return "Result Found";
        }
        int aTime = Math.min(a / da, t - 1);
        int bTime = Math.min(b / db, t - 1);
        for (int i = 0; i < aTime + 1; i++) {
            for (int j = 0; j < bTime + 1; j++) {
                if (a - da * i == x || b - db * j == x) {
                    System.out.println("YES");
                    return "Result Found";
                }
                if ((a - da * i) + (b - db * j) == x) {
                    System.out.println("YES");
                    return "Result Found";
                }
            }
        }
        System.out.println("NO");
    }
}


