import java.util.Scanner;

public class squareroot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number to find its square root: ");
        double num = scanner.nextDouble();
        
        double result = root(num);
        if (result == -1) {
            System.out.println("Can't find square root of a negative number.");
        } else {
            System.out.println("Square root of " + num + " is: " + result);
        }
        
        scanner.close();
    }

    public static double root(double num) {
        if (num < 0) {
            return -1;  
        } else {
            return Math.sqrt(num);
        }
    }
}
