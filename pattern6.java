
/* Pyramid
         ********* 
          *******
           *****
            ***
             *
 */

public class pattern6 {
   public static void main(String []args){
      int n = 5;

      
      for(int i=0;i<n;i++){

         for(int j=0;j<i+1;j++){
             System.out.print(" ");
         }

         for(int j=0;j<2*(n-i)-1;j++){
            System.out.print("*");
         }
         for(int j=0;j<i+1;j++){
            System.out.print(" ");
         }

         System.out.println("");
      }

      for(int i=0;i<n;i++){
      
         for(int j=0;j<i+1;j++){
            System.out.print(" ");
         }

         for(int j=0;j<2*(n-i)-1;j++){
            System.out.print(j+1);
         }

         for(int j=0;j<i+1;j++){
            System.out.print(" ");
         }
         System.out.print("\n");
      }

      for(int i=0;i<n;i++){

         for(int j=0;j<i+1;j++){
            System.out.print(" ");
         }

         for(int j=0;j<2*(n-i)-1;j++){
            System.out.print(n-i);
         }

         for(int j=0;j<i-1;j++){
            System.out.print(" ");
         }
         System.out.println("");
      }

   }
}
