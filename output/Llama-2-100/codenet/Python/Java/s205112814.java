Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int m = sc.nextInt();

List<List<Integer>> gate_cond = new ArrayList<>();
for (int i = 0; i < m; i++) {
    List<Integer> l = new ArrayList<>();
    for (int j = 0; j < n; j++) {
        l.add(sc.nextInt());
    }
    gate_cond.add(l);
}

int max_under_th = Collections.max(gate_cond, (l1, l2) -> Integer.compare(l1.get(0), l2.get(0)));
int min_upper_th = Collections.min(gate_cond, (l1, l2) -> Integer.compare(l1.get(1), l2.get(1)));
if (min_upper_th - max_under_th >= 0) {
    System.out.println(min_upper_th - max_under_th + 1);
} else {
    System.out.println(0);
}
