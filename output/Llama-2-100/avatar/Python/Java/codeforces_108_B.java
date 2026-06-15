public class codeforces_108_B {
    public static String s( ) {
        Scanner sc = new Scanner(System.in);
        List<Integer> a = Arrays.asList(sc.nextLine().split(" ")).stream().map(Integer::parseInt).collect(Collectors.toList());
        a.sort(Comparator.naturalOrder());
        for (int i = 1; i < a.size(); i++) {
            if (a.get(i) != a.get(i - 1) && a.get(i) < a.get(i - 1) * 2) {
                return "YES";
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        System.out.print(s());
    }
}


