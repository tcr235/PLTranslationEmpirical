public class s666154520 {
    public static void main(String[] args) {
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i < 100000; i++) {
            if (i * i > n) {
                System.out.println(i * (i - 1));
                break;
            }
        }
    }
}
