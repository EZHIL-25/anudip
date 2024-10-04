import java.util.Scanner;

public class ArmstrongNumberFinder {
   public static void printArmstrongNumbers(int var0, int var1) {
      System.out.println("Armstrong numbers between " + var0 + " and " + var1 + ":");

      int var3;
      for(int var2 = var0; var2 <= var1; var2 = var3 + 1) {
         var3 = var2;
         int var4 = 0;

         for(int var5 = Integer.toString(var2).length(); var2 > 0; var2 /= 10) {
            int var6 = var2 % 10;
            var4 = (int)((double)var4 + Math.pow((double)var6, (double)var5));
         }

         if (var4 == var3) {
            System.out.println(var3);
         }
      }

   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter the start of the range: ");
      int var2 = var1.nextInt();
      System.out.print("Enter the end of the range: ");
      int var3 = var1.nextInt();
      printArmstrongNumbers(var2, var3);
      var1.close();
   }
}
