public class s702834515 {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    int r = 0;
    for (int ii = 0; ii < n; ii++) {
      if ((ii + 1) % 3 == 0 && (ii + 1) % 5 == 0) {
        r += (ii + 1);
      } else if ((ii + 1) % 3 == 0) {
        r += (ii + 1);
        System.out.print("Fizz");
      } else if ((ii + 1) % 5 == 0) {
        r += (ii + 1);
        System.out.print("Buzz");
      } else {
        System.out.print(ii + 1);
      }
    }
    System.out.println("Result: " + r);
  }
}
