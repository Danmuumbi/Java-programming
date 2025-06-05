import java.util.Scanner;

public class checkoddoreven {
    
    
    public static String result(int a) {
        if (a % 2 == 0) {
            return "The number " + a + " is even.";
        } else {
            return "The number " + a + " is odd.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); 
        
        String result = result(number); 
        System.out.println(result);
        
        scanner.close(); 
    }
}