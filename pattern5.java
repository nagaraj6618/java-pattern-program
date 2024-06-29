public class pattern5 {
   public static void main(String[] args) {
    
      int n = 5;
      int m=0;
      for(int i=0;i<n;i++){
         
         for(int j=n;j>i;j--){
            System.out.print(" ");
         }
         
         for(int k=0;k<i+1+m;k++){
            System.out.print("*");
         }
         m++;
         for(int j=n;j>i;j--){
            System.out.print(" ");
         }
         System.out.println("");
      }
      m=0;
      for(int i=0;i<n;i++){
         for(int j=n;j>i;j--){
            System.out.print(" ");
         }

         for(int k=0;k<i+1+m;k++){
            System.out.print(k+1);
         }
         m++;
         for(int j=n;j>i;j--){
            System.out.print(" ");
         }
         System.out.println("");
      }
      m=0;

      for(int i=0;i<n;i++){
         for(int j=n;j>i;j--){
         
            System.out.print(" ");
         }

         for(int k=0;k<i+1+m;k++){
            System.out.print(2*n-k-1);
         }
         m++;
         for(int j=n;j>i;j--){
         
            System.out.print(" ");
         }
         System.out.println("");
      }
      

   }
}
