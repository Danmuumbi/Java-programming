import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sum = 0;
        for(int i = 1;i<=10; i++){
            sum = sum+=i;
        }
        System.out.println(sum);

        int  my_array[] = {10,20,30,40,50,60,70};




        for(int i = 0; i<9; i++){

        }
        for(int i = 0;i<9;i++){
            sum+=my_array[i];
        }
        System.out.println(sum);

        input.close();
    }
    
}
