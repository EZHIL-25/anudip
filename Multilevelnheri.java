class  Multilevelnheri {
   public void display() { 
      String Name  = " Harish ";
      System.out.println("EmployeeName : +Name");
   }
}
class EmpNo extends  Multilevelnheri {
   public void area() { 
     int EmpNo = 1002;
      System.out.println("Employee Number :" +EmpNo);
   }
}
class  EmpAge extends  Multilevelnheri {
   public void volume() { 
      int Age  = 44;
      System.out.println(" Employee Age :" +Age);
   }
}
public class Tester {
   public static void main(String[] arguments) {
        EmpAge  emp = new  EmpAge ();
       emp.display();
       emp.area();
        emp.volume();
   }
}