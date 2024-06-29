/*
   Inverted Right Pyramid
   * * * *
   * * *
   * *
   * 
   
   1 2 3 4 5 
   1 2 3 4
   1 2 3
   1 2
   1

   1 1 1 1 1
   2 2 2 2
   3 3 3
   4 4
   5

   5 5 5 5 5
   4 4 4 4
   3 3 3
   2 2
   1

     
*/


public class pattern4 {
   public static void main(String[] args) {
      int n = 5;
      for(int i=0;i<n;i++){
         for(int j=n;j>i;j--){
            System.out.print("* ");
         }
         System.out.print("\n");
      }    

      for(int i=0 ; i<n ;i++){
         for(int j=n;j>i;j--){
            System.out.print(n-j+1+" ");
         }
         System.out.println("");
      }

      for(int i=0;i<n;i++){
         for(int j = n;j>i;j--){
            System.out.print(i+1+" ");
         }
         System.out.println("");
      }

      for(int i=0;i<n;i++){
         for(int j=n;j>i;j--){
            System.out.print(n-i+" ");
         }
         System.out.println("");
      }
   }
}
