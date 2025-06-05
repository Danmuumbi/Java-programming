public class Student {
    public static int counter = 0;

    public Student() {
        counter++;
    }

    public static void display() {
        System.out.println("Number of instances: " + counter);
    }
}
