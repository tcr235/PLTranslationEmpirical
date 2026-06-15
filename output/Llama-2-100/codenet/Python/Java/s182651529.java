import java.util.Scanner;

public class s182651529 {

public static void main(String[] args) {

int N, K;
String[] score = new String[N];

System.out.print("Enter N and K: ");
Scanner sc = new Scanner(System.in);
N = sc.nextInt();
K = sc.nextInt();

System.out.print("Enter score: ");
sc.nextLine(); // skip the newline
score = Arrays.asList(sc.nextLine().split(" "));

int mae = 0;
int usiro = K;
for (int i = 0; i < N - K; i++) {
  if (score.get(mae) < score.get(usiro)) {
    System.out.println("Yes");
  } else {
    System.out.println("No");
  }
  mae++;
  usiro++;
}
}
}
