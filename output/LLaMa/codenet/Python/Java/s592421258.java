import java.util.Scanner;

public class s592421258 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder s = new StringBuilder(in.next()).append(in.next());
        System.out.println(s.contains(in.next()) ? "Yes" : "No");
    }
}