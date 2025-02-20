//import java.util.Scanner;

/*public class array{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");

        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }   

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }        
        double average = (double) sum / numbers.length;

    
        double[] differences = new double[n];
        for (int i = 0; i < numbers.length; i++) {
            differences[i] = numbers[i] - average;
        }    
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Differences between each element and the average:");
        for (int i = 0; i < differences.length; i++) {
            System.out.println("Element " + (i+1) + ": " + differences[i]);
        }

        scanner.close();
    }
}*/



/*public class array{
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
    }*/

/*import java.util.Arrays;
public class array{
    public static void main(String[] args){
        int[] arr = {12,34,67,89,76,45,98,19};
        Arrays.sort(arr); 

        System.out.println("ELement in ascending order is : ");
        for(int number : arr){
            System.out.println(number + " ");
        }
    }
} */

/*public class array{
    public static void main(String[] args){
        int[] arr = {27,46,55,71,89,66,89,92};
        int sum = 0;
        for(int i=0; i<arr.length; i++){
             sum += arr[i];
          
        }  
            System.out.println(" the sum of all element of array is:" +sum);
        
    }
}*/

public class array{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        reverse(arr);
        System.out.println(" the revese array is:");
        for(int i : arr){
            System.out.print( i + " ");
        } 
       }

       public static void reverse(int[] arr){
        int start = 0;
        int end =  arr.length - 1;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
       }
}





    
