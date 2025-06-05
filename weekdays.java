// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class weekdays{
 

   public static void main(String[] var0) {
      Scanner scanner = new Scanner(System.in);
    
      System.out.println("please enter a valid day (1 - 7):");

      int days =  scanner.nextInt();
      String day = "";


      switch (days) {
        case 1: day = "Monday";
        break;

        case 2: day = "Tuesday";

            
            break;

            case 3: day = "Wednesday";
            break;

            case 4: day = "Thursday";
            break;

            case 5: day = "Friday";
            break;
      
            case 6: day = "Saturday";
            break;

            case 7: day = "Sunday";
            break;
        default : 
        System.out.println("Day not found");
            break;

           
      }
      

      System.out.println("It is on "+ day);
    

      scanner.close();
   }
}
