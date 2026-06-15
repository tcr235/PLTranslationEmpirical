import java.util.Scanner;

public class s441329208 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        List<String> list = new ArrayList<>();
        list.add(s);
        list.add(t);
        Collections.sort(list);
        if (list.get(0).compareTo(list.get(1)) < 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
