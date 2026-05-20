import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[M];
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
        }
        for (int i = 0; i < M; i++) {
            y[i] = sc.nextInt();
        }
        System.out.println((max(max(x), X) < min(min(y), Y) ? "No War" : "War"));
    }
    
    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}