Scanner sc = new Scanner ( System.in );
int n = sc.nextInt();
int k = sc.nextInt();
List<Integer> list = new ArrayList<>();
for ( int i = 0; i < n; i++ ) {
list.add ( sc.nextInt());
}
List<Integer> sortedList = list.stream().sorted().limit(k).collect(Collectors.toList());
System.out.println(sortedList.stream().reduce(0, (a, b) -> a + b));


