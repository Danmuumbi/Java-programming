// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class grade{
 

   public static void main(String[] var0) {
      Scanner scanner = new Scanner(System.in);
    
      System.out.println("Please enter Student Marks:");

      int marks =  scanner.nextInt();
      char grade = 0;
    //   char gradeb = 'B';
    //   char gradec = 'C';
    //   char graded = 'D';
      

      


      switch (marks/10) {
        case 10 : 
        

        
        case 9 : 
        

        
        case 8 :
        

       
        case 7 : grade = 'A';
        

        break;

        
        case 6 : grade = 'B';
        

        break;
        case 5 : grade = 'C';
        

        break;
        case 4 : grade = 'C';
        

        break;
        case 3 : grade = 'D';
        

        break;
        case 2 : grade = 'E';
        

        break;
        case 1 : grade = 'F';
        

        break;



        

           
      }
      

      System.out.println("YOUR GRADE IS  "+ grade);
      System.out.println(marks);
    

      scanner.close();
   }
}
