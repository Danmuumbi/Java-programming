import java.util.Scanner;

public class userinput {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("take integer as input ");
        int num = input.nextInt();
        System.out.println("you entered "+ num);

        input.nextLine();

        System.out.println("take char as the input ");
        String character = input.nextLine();
        System.out.println("you entered   "+character);
        


        input.close();
    }
}