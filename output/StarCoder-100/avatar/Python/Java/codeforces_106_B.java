import java.util.*;
public class codeforces_106_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> input_array = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            int S = sc.nextInt();
            int R = sc.nextInt();
            int H = sc.nextInt();
            int C = sc.nextInt();
            input_array.add(S);
            input_array.add(R);
            input_array.add(H);
            input_array.add(C);
        }
        int minimum_cost = 100000;
        int input_number = 0;
        for (int i = 0; i < n; i++) {
            int current_item = input_array.get(i);
            int cost = current_item;
            if (cost < minimum_cost) {
                minimum_cost = cost;
                input_number = i + 1;
            }
        }
        System.out.println(input_number);
    }
}

