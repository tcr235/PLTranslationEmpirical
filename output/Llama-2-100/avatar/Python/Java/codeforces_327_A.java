public class codeforces_327_A {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String s = args[1];
        if (s.equals("")) {
            System.out.println(n - 1);
        } else {
            List<Integer> indices = new ArrayList<>();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    indices.add(i);
                }
            }
            if (indices.size() == 1) {
                System.out.println(n);
            } else {
                int maximum = 0;
                List<Combination> combs = new ArrayList<>();
                for (int i = 0; i < indices.size(); i++) {
                    int j = i + 1;
                    if (j == indices.size()) {
                        break;
                    }
                    Combination combination = new Combination(indices.get(i), indices.get(j));
                    combs.add(combination);
                    int distance = Math.abs(indices.get(i) - indices.get(j)) - 1;
                    maximum = Math.max(maximum, 2 + 2 * distance);
                }
                System.out.println(s.length() + maximum);
            }
        }
    }



Can you please help me to optimize the Java code?
