import java.util.Arrays;
import java.util.Scanner;

public class s846046431
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        int S = Arrays.stream(A).mapToInt(Integer::intValue).sum();
        int max = A[N - M];
        if ((double)max / S - 1.0 / (4 * M) >= 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}