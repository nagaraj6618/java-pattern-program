/* 
      Half Diamond Star Pattern
      
      1        1
      12      21
      123    321
      1234  4321
      1234554321

*/


public class pattern10 {
   public static void main(String [] args){
      int n=5;
      for(int i=0;i<n;i++){

         for(int j=0;j<i+1;j++){
            System.out.print(j+1);
         }

         for(int k=0;k<2*(n-i-1);k++){
            System.out.print(" ");
         }
         for(int j=i+1;j>0;j--){
            System.out.print(j);
         }

         System.out.print("\n");
      }
   }
}
