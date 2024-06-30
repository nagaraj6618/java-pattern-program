public class pattern8 {

   public static void main(String []args){

      int n = 5;
      int start;
      for(int i=0;i<n;i++){

         for(int j=0;j<i+1;j++){

            if(i%2==0 && j%2==0){
               System.out.print("1 ");
            }
            else if(i%2==1 && j%2==1){
               System.out.print("1 ");
            }
            else{
               System.out.print("0 ");
            }
         }
         System.out.print("\n");
      }

      for(int i=0;i<n;i++){

         if(i%2==0) start = 1;
         else start = 0;

         for(int j=0;j<i+1;j++){
            System.out.print(start);
            start = 1-start;

         }
         System.out.print("\n");
      }
   }
   
}
