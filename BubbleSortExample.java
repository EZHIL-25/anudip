import java.util.Scanner;
class BubbleSortExample1  
{  
    public static void main(String args[]) 
      {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the elements:");
        for (int i=0;i<n;i++)
         {
            numbers[i] = sc.nextInt();
          }
            for (int i=0;i<n-1;i++) 
            {
            for (int j=0;j<n-1-i;j++) 
               {
                if (numbers[j] > numbers[j+1])
                {
                    int temp=numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted array in ascending order:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        sc.close();
    }
}
