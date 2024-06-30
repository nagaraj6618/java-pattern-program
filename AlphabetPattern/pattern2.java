
/*
      Alpha-Hill Pattern
          A
         ABA
        ABCBA
       ABCDCBA
      ABCDEDCBA

 */



public class pattern2 {
   public static void main(String []args){

      int n=5;

      for(int i=0;i<n;i++){
         for(int j=0;j<n-i-1;j++){
            System.out.print(" ");
         }

         for(int j=0;j<i+1;j++){
            System.out.print((char)(65+j));
         }
         for(int j=0;j<i;j++){
            System.out.print((char)(65+i-j-1));
         }

         System.out.println("");
      }
   }
}
