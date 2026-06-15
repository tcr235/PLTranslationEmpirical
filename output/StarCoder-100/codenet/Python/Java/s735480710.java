import java.util.*;
public class s735480710 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] a = sc.next().split(" ");
        String[] b = new String[n];
        for(int i=0;i<n;i++){
            if(i%2==0){
                b[i]=a[i+1];
            }
            else{
                b[i]=a[n-i-1];
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(b[i]+" ");
        }
    }
}
