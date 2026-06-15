Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
String[] S = new String[N];
for (int i = 0; i < N; i++) {
    S[i] = sc.nextLine();
}
String str = String.join("", sorted(S));
System.out.println(str);
