public class s759499751 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        String[] a = scanner.nextLine().split(" ");
        int[] c = new int[n];
        for (int i = 1; i < n; i++) {
            if (a[i].equals("C") && a[i - 1].equals("A")) {
                c[i] = c[i - 1] + 1;
            } else {
                c[i] = c[i - 1];
            }
        }
        for (int w = 0; w < k; w++) {
            int l = scanner.nextInt() - 1;
            int r = scanner.nextInt() - 1;
            System.out.println(c[r] - c[l]);
        }
    }
}
