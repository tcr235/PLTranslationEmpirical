Scanner sc = new Scanner(System.in);
String[] S = sc.nextLine().split(" ");
int A = sc.nextInt();
int B = sc.nextInt();
if (S[A] == "-" && S.length == 1) {
    System.out.println("Yes");
} else {
    System.out.println("No");
}
