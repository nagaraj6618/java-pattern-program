/*
   Right-Angled Triangle Pattern
   *
   * *
   * * *
   * * * *

 */

import java.util.Scanner;

public class pattern2 {
   public static void main(String args[]){
      int n;
      try(Scanner sc = new Scanner(System.in)){
         n  = sc.nextInt();
      }
      
      
      for(int i=0;i<n;i++){
         for(int j =0;j<i+1;j++){
            System.out.print("* ");
         }
         System.out.print("\n");
      }
      // sc.close();
      
   }

}
