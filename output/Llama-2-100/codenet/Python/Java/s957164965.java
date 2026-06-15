Scanner sc = new Scanner(System.in);

int X = sc.nextInt();
int N = sc.nextInt();

List<Integer> p = new ArrayList<>();
for (int i = 0; i < N; i++) {
p.add(sc.nextInt());
}

p.sort();

Map<Integer, List<Integer>> candidates = new HashMap<>();
for (int i = -1; i <= 102; i++) {
if (p.contains(i)) {
continue;
}
if (!candidates.containsKey(Math.abs(X - i))) {
candidates.put(Math.abs(X - i), new ArrayList<Integer>());
}
candidates.get(Math.abs(X - i)).add(i);
}

int smallest = Collections.min(candidates.keySet());

int minNum = Collections.min(candidates.get(smallest));

System.out.println(minNum);

