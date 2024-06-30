/*
      E 
      D E
      C D E
      B C D E
      A B C D E
 */

public class pattern3 {
   public static void main(String []args){

      int n = 5;

      for(int i=0;i<n;i++){

         for(int j=0;j<i+1;j++){


            System.out.print((char)(65+(n+j-i-1))+" ");


         }
         System.out.println("");
      }
   }   
}
