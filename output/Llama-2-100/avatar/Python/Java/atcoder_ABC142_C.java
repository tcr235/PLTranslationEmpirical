public class atcoder_ABC142_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String[] A = scanner.nextLine().split(" ");
        List<Integer> A_ = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A_.add(Integer.parseInt(A[i]));
        }
        List<Integer> A__ = new ArrayList<>();
        A_.sort(Comparator.comparingInt(a -> a));
        for (int i = 0; i < A__.size() - 1; i++) {
            System.out.print(A__.get(i) + " ");
        }
        System.out.print(A__.get(A__.size() - 1));
    }
}


