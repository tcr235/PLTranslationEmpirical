import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        List<int[]> A = new ArrayList<>();
        String[] inputs = scanner.nextLine().split(" ");
        
        for (int i = 0; i < N; i++) {
            A.add(new int[]{i + 1, Integer.parseInt(inputs[i])});
        }
        
        Collections.sort(A, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[1], o2[1]);
            }
        });
        
        List<Integer> A__ = new ArrayList<>();
        for (int[] a : A) {
            A__.add(a[0]);
        }
        
        for (int i = A__.size() - 1; i > 0; i--) {
            System.out.print(A__.get(i) + " ");
        }
        System.out.println(A__.get(0));
    }
}