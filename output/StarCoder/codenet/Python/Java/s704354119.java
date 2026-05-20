public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        String[] l = sc.next().split(" ");
        long max = Long.MIN_VALUE, min = Long.MAX_VALUE;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Long.parseLong(l[i]);
            if (max < Long.parseLong(l[i])) {
                max = Long.parseLong(l[i]);
            }
            if (min > Long.parseLong(l[i])) {
                min = Long.parseLong(l[i]);
            }
        }
        System.out.println(min + " " + max + " " + sum);
    }
}