import java.util.Scanner;

public class codeforces_59_A {

public static void main(String[] args) {

String txt = sc.nextLine();
int cu = 0;
int cl = 0;
for (int i = 0; i < txt.length(); i++) {

if (txt.charAt(i).equalsIgnoreCase(Character.toLowerCase(txt.charAt(i)))) {

cl++;
} else {

cu++;
}
}

if (cu > cl) {

txt = txt.toUpperCase();
} else {

txt = txt.toLowerCase();
}

System.out.println(txt);

}

}


