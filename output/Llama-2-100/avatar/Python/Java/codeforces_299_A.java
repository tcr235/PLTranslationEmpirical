public class codeforces_299_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_inp = sc.nextInt();
        List<Integer> arr_inp = Arrays.asList(sc.nextLine().split(" "));
        List<Integer> sp_inp = Arrays.asList(sc.nextLine().split(" "));
        List<Integer> a = Arrays.asList(sc.nextLine().split(" "));
        int result = -1;
        for (int x : a) {
            if (x % num_inp == 0) {
                result = x;
                break;
            }
        }
        System.out.println(result);
    }
}


