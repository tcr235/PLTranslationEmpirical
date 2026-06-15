import java.util.Scanner;

public class s813548165 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.nextLine();
        String T = sc.nextLine();

        char[][] char_lists = new char[N][2];

        for (int i = 0; i < N; i++) {
            char[] temp = new char[2];
            temp[0] = S.charAt(i);
            temp[1] = T.charAt(i);
            char_lists[i] = temp;
        }

        System.out.println("".join(Arrays.asList(char_lists)));
    }
}
