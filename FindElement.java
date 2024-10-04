import java.util.Scanner;

 class FindElement
{
    public static void main(String args[]) 
    {
        int[] numbers = {10, 20, 30, 40, 50};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to find: ");
        int target = sc.nextInt();

        boolean found = false;
        for (int number : numbers)
           {
            if (number == target)
              {
                found = true;
                break;
              }
           }

        if (found) 
           {
            System.out.println("Element " + target + " found in the array.");
        }
         else 
           {
            System.out.println("Element " + target + " not found in the array.");
            }

        sc.close();
    }
}
