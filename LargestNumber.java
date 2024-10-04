class LargestNumber
  {
    public static void main(String args[])
   {
    int[] numbers = {10, 25, 3, 42, 15, 7, 8};
    int largest = numbers[0]; 
    for (int i = 1; i < numbers.length; i++) 
        {
            if (numbers[i] > largest)
           {
                largest = numbers[i];           
           }
        }

        System.out.println("The largest number in the array is: " + largest);
    }
}
