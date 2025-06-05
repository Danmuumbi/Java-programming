
public class Student1 {
    int age;  

    public static class StudentDetails {
        public static void main(String[] args) {
            Student1 student1 = new Student1();
            Student1 student2 = new Student1();
            student1.age = 20;
            student2.age = 25;
            student1.age = 21;

            System.out.println("Student 1 Age: " + student1.age);
            System.out.println("Student 2 Age: " + student2.age);
        }
    }
}