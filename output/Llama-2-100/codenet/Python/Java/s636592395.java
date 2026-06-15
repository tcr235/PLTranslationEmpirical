public class s636592395 {

    public static void main(String[] args) {
        // input
        int N = Integer.parseInt(sc.nextLine());
        List<Integer> A = Arrays.asList(sc.nextLine().split(" "));

        // sort the list
        Collections.sort(A);

        // calculate the difference
        int ans = A.get(A.size() - 1) - A.get(0);

        System.out.println(ans);
    }
}
