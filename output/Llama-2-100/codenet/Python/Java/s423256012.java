Scanner sc = new Scanner(System.in);
int A = sc.nextInt();
int B = sc.nextInt();

if ((A+B)%2 == 1) {
    System.out.println("IMPOSSIBLE");
} else {
    System.out.println((A+B)/2);
}
