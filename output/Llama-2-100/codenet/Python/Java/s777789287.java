Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int m = sc.nextInt();
List<Integer> a = new ArrayList<>();
for (int i = 0; i < m; i++) {
    a.add(sc.nextInt());
}
Collections.sort(a, Collections.reverseOrder());
double s = (double) a.stream().sum() / (4 * m);
if (a.get(m - 1) >= s) {
    System.out.println("Yes");
} else {
    System.out.println("No");
}
