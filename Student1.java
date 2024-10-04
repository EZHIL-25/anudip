class Student1 {
   String name;
   int rollNumber;
   String phoneNumber;
   String address;

   Student1(String var1, int var2, String var3, String var4) {
      this.name = var1;
      this.rollNumber = var2;
      this.phoneNumber = var3;
      this.address = var4;
   }

   void printDetails() {
      System.out.println("Name: " + this.name);
      System.out.println("Roll Number: " + this.rollNumber);
      System.out.println("Phone Number: " + this.phoneNumber);
      System.out.println("Address: " + this.address);
   }

   public static void main(String[] var0) {
      Student1 var1 = new Student1("Sam", 1, "1234567890", "123 Main St");
      Student1 var2 = new Student1("John", 2, "9876543210", "456 Elm St");
      System.out.println("\nStudent 1 Details:");
      var1.printDetails();
      System.out.println("\nStudent 2 Details:");
      var2.printDetails();
   }
}
