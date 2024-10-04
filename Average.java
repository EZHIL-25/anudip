import java.util.Scanner;

class Average {
   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter the first number:");
      double var2 = var1.nextDouble();
      System.out.println("Enter the second number:");
      double var4 = var1.nextDouble();
      System.out.println("Enter the third number:");
      double var6 = var1.nextDouble();
      printAverage(var2, var4, var6);
   }

   public static void printAverage(double var0, double var2, double var4) {
      double var6 = (var0 + var2 + var4) / 3.0D;
      System.out.println("The average is: " + var6);
   }
}
