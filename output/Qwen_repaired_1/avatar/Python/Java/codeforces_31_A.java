import java.util.Scanner;

public class codeforces_31_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       scanner.useDelimiter("\n");
        int n = Integer.parseInt(scanner.next()); 
        String[] numbers = scanner.next().split("\\s+");
		
        for(int i=0;i<numbers.length;i++)
            numbers[i]=numbers[i].trim(); 
       
        int[] arr=new int[numbers.length];
        for(int i=0;i<numbers.length;i++)
             arr[i]=Integer.parseInt(numbers[i]); 

        nextTrio(n,arr);
    }

   public static void nextTrio(int n,int[] ar){
       int c[]=new int[n+1];
       for(int i=0;i<n;i++){
           for(int j=i+1;j<n;j++){
               for(int k=j+1;k<n;k++){
                if(ar[i]== ar[j]+ar[k]){
                  System.out.print((k+1)+" "+(j+1)+" "+(i+1));
                   System.exit(0);
                 }  
              }     
           }          
       }   
          System.out.print("-1"); 
   }
}