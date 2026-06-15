public class codeforces_609_B {
    public static void main(String[] args) {
        int n = _input();
        int m = _input();
        List<Integer> lst = Arrays.asList( _input() );
        Map<Integer, Integer> l = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!l.containsKey(lst.get(i))) {
                l.put(lst.get(i), 1);
            } else {
                l.put(lst.get(i), l.get(lst.get(i)) + 1);
            }
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (l.get(lst.get(i)) > 1) {
                res += n - i - l.get(lst.get(i));
                l.put(lst.get(i), l.get(lst.get(i)) - 1);
            } else {
                res += n - i - 1;
            }
        }
        System.out.println(res);
    }

    public static int _input() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt() + scanner.nextInt();
    }
}


