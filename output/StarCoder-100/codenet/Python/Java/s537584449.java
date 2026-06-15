import java.util.*;

public class s537584449 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        func(a);
    }

    public static void func(int a) {
        int temp = a;
        int result = 0;
        while (temp!= 0) {
            result += temp % 10;
            temp = temp / 10;
        }
        if (result == 1) {
            System.out.println("10");
        } else {
            System.out.println(result);
        }
    }
}
