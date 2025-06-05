public class  Variables{
    public static void main(String [] args){
        int age = 30;

        System.out.println("you are "+ age + "  years old");

        int twinsage = age;
        System.out.println("my twin is  "+ twinsage + "  years old");

        long large_number = 3_23_321_123L;
        byte ages = 45;// primitive type no objects
        float price =  99.9F;
        char letter = 'a';
        boolean ans  = true;

        String message = new String("hello world");
        String message1 = "shrt way of instantiating strings";

        System.out.println(message);
        System.out.println(message1);
        System.out.println(message.length());
        System.out.println(message.indexOf("o"));
        System.out.println(message.replace("hello", "hi"));
        System.out.println(message.toUpperCase());

    }
    
}
