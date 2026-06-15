Scanner sc = new Scanner(System.in);

String s = sc.nextLine();

if (s.length()==2) {
    System.out.println(s);
} else {
    System.out.println(new StringBuffer(s).reverse().toString());
}
