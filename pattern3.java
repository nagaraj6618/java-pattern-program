/*
   Right angle triangle with numbers;
   
   1
   1 2
   1 2 3
   1 2 3 4

 */
import java.util.Scanner;
public class pattern3 {
   public static void main(String[] ags){
      try{
         
         Scanner sc  = new Scanner(System.in);
         int n = sc.nextInt();
         sc.close();
         System.out.println("*****************Pattern Model 1*******************");
         for (int i = 0; i<n; i++){
            for (int j=0;j<i+1;j++){
               System.out.print(j+1+" ");
            }
            System.out.println("");
         }
         System.out.println("*****************Pattern Model 2*******************");
         for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
               System.out.print(i+1+" ");
            }
            System.out.println("");
         }
      }
      catch(Exception e){
         e.printStackTrace();
      }
   }
}
