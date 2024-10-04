 class AverageCalc{

       public static double calculateAverage(int[] numbers){
        if (numbers == null || numbers.length == 0){
            return 0; 
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;       
    }

        return (double) sum / numbers.length;  
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

    double average = calculateAverage(numbers);
        System.out.println("The average is: " + average);
    }
}
