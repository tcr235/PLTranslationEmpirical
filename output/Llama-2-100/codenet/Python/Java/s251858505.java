public class s251858505 {

\begin{code}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        boolean result = map(num1, num2, (x, y) -> x == y);
        System.out.println(result);
    }

    public static boolean map(int num1, int num2, IntFunction<Boolean> function) {
        return function.apply(num1, num2);
    }
}
\end{code}
