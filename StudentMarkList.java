import java.util.Scanner;

public class StudentMarkList {
   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      int[] var2 = new int[5];
      int var3 = 0;
      System.out.println("Enter marks for 5 subjects:");

      for(int var6 = 0; var6 < 5; ++var6) {
         System.out.print("Subject " + (var6 + 1) + ": ");
         var2[var6] = var1.nextInt();
         var3 += var2[var6];
      }

      double var4 = (double)var3 / 5.0D;
      System.out.println("\nTotal Marks: " + var3);
      System.out.println("Average Marks: " + var4);
      if (var4 >= 60.0D) {
         System.out.println("Grade: Pass");
      } else {
         System.out.println("Grade: Fail");
      }

      var1.close();
   }
}
