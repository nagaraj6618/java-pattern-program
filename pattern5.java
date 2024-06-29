public class pattern5 {
   public static void main(String[] args) {
    
      int n = 5;
     
      for(int i=0;i<n;i++){
         
         for(int j=n;j>i;j--){
            System.out.print(" ");
         }
         
         for(int k=0;k<2*i+1;k++){
            System.out.print("*");
         }

         for(int j=n;j>i;j--){
            System.out.print(" ");
         }
         System.out.println("");
      }

      for(int i=0;i<n;i++){
         for(int j=n;j>i;j--){
            System.out.print(" ");
         }

         for(int k=0;k<2*i+1;k++){
            System.out.print(k+1);
         }

         for(int j=n;j>i;j--){
            System.out.print(" ");
         }
         System.out.println("");
      }


      for(int i=0;i<n;i++){
         for(int j=n;j>i;j--){
         
            System.out.print(" ");
         }

         for(int k=0;k<2*i+1;k++){
            System.out.print(2*n-k-1);
         }

         for(int j=n;j>i;j--){
         
            System.out.print(" ");
         }
         System.out.println("");
      }
      

   }
}
