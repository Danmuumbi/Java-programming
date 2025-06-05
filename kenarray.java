import java.util.Scanner;

public class kenarray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Array Size:");
        int num = input.nextInt();

        // Initialize the array with the specified size
        int[] myArray = new int[num]; // Use num instead of num + 1

        // Use < instead of <= to prevent ArrayIndexOutOfBoundsException
        for (int i = 0; i < num; i++) {
            System.out.println("Enter element  " + (i + 1) + ":"); // Prompt for each element
            myArray[i] = input.nextInt();
        }

        input.close();

        // Optional: Print the array to verify input
        System.out.print("Array elements: ");
        // for (int element : myArray) {
        //     System.out.print(element + " ");
        // }
        for(int i = 0; i < num; i++){
            System.out.println(myArray[i]);
        }
    }
}