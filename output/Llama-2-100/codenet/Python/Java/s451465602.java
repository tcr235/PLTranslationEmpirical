public class s451465602 {

public static void main(String[] args) {

int n = Integer.parseInt(sc.nextLine());

int h = n / 3600;
n = n % 3600;

int m = n / 60;
n = n % 60;

int s = n;

System.out.println(String.format("%d:%02d:%02d", h, m, s));

}

}
