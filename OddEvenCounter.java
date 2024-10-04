import java.util.Scanner;

public class OddEvenCounter {
   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      int var2 = 0;
      int var3 = 0;
      System.out.println("Enter numbers to count odd and even numbers.");
      System.out.println("Enter '1' to stop the program.");

      while(true) {
         System.out.print("Enter a number: ");
         int var4 = var1.nextInt();
         if (var4 == 1) {
            System.out.println("Total even numbers: " + var3);
            System.out.println("Total odd numbers: " + var2);
            var1.close();
            return;
         }

         if (var4 % 2 == 0) {
            ++var3;
         } else {
            ++var2;
         }
      }
   }
}
