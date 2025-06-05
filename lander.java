import java.util.Scanner;
public class lander {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("enter country ");

        
        String country = input.nextLine();
        //3 capital cities
        

        if (country == "kenya") {

            System.out.println("Nairobi");
            
        }
        else if(country == "jamaica"){

            System.out.println(" Livingstone");

        }

        else{
            System.out.println("No country fount");
        }

        input.close();
    }

    
    
}
