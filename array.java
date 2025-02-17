import java.util.Scanner;

/*public class array{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Initialize the array
        int[] numbers = new int[n];

        // Take input from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Calculate the sum of the array elements
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // Calculate the average of the array elements
        double average = (double) sum / numbers.length;

        // Calculate the difference between each element and the average
        double[] differences = new double[n];
        for (int i = 0; i < numbers.length; i++) {
            differences[i] = numbers[i] - average;
        }

        // Print the results
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Differences between each element and the average:");
        for (int i = 0; i < differences.length; i++) {
            System.out.println("Element " + (i+1) + ": " + differences[i]);
        }

        scanner.close();
    }
}*/



public class array{
    public static void main(String []args){
        int[] array = {10, 25, 35, 75, 65};
        int largest = findlargest(array);
        System.out.println(" the largest number in an array is : "  +  largest);
    }

    public static int findlargest(int[] arr ){

    int largest = arr[0];

    for(int i=0; i < arr.length; i++){
        if (arr[i] > largest){
            largest = arr[i];
        }
    }
    return largest;

}
    }



    
    
