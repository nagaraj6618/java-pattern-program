/*
   A
   A B
   A B C
   A B C D
   A B C D E
   A B C D E F
 */

public class pattern1 {
   
   public static void main(String []args){

      int n = 5;

      for(int i=0;i<n;i++){

         for(int j=0;j<i+1;j++){
            System.out.print((char)(65+j) + " ");
            
         }
         System.out.print("\n");
      }
      System.out.println("\n Reverse Model \n");

      for(int i=0;i<n;i++){
         for(int j=0;j<n-i;j++){
            System.out.print((char)(65+j)+" ");
         }
         System.out.print("\n");
      }
   }
}
