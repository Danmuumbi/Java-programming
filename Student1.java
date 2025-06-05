// public class Student1 {
//     int age; // Changed from static to instance variable

//     public static void main(String[] args) {
//         Student1 student1 = new Student1();
//         Student1 student2 = new Student1();
//         student1.age = 20;
//         student2.age = 25;
//         student1.age = 21; // This line updates student1's age

//         System.out.println("Student 1 Age: " + student1.age);
//         System.out.println("Student 2 Age: " + student2.age);
//     }
// }

// public class Student1 {
//     static int age; // Static variable shared by all instances

//     public static void main(String[] args) {
//         Student1 student1 = new Student1();
//         Student1 student2 = new Student1();
        
//         // Set the static age
//         Student1.age = 25; // Set age for both students

//         System.out.println("Student 1 Age: " + Student1.age);
//         System.out.println("Student 2 Age: " + Student1.age);
//     }
// }




public class Student1 {
    int age;  

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