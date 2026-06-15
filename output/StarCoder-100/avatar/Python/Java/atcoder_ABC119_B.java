import java.util.Scanner;

public class atcoder_ABC119_B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] x = new double[N];
        for (int i = 0; i < N; i++) {
            String s = sc.next();
            s = s.replace("JPY", "* 1.0").replace("BTC", "* 380000.0");
            x[i] = eval(s);
        }
        System.out.println(sum(x));
    }

    public static double sum(double[] x) {
        double sum = 0;
        for (double d : x) {
            sum += d;
        }
        return sum;
    }
}
