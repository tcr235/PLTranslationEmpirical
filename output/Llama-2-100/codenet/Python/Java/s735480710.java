import java.util.LinkedList;
public class s735480710 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String[] a = args[1].split(" ");
        LinkedList<String> b = new LinkedList<>();

        b.addAll(Arrays.asList(a[1::2]).reverse());
        b.addAll(Arrays.asList(a[::2]));

        if (n%2==0) {
            System.out.println(" ".join(b));
        } else {
            System.out.println(" ".join(b.reverse()));
        }
    }
}
