class Static_Variable {
    static int age;  // Static variable
}

public class staticvariable {  
    public static void main(String args[]) {
        // Accessing static variable directly through the class name
        Static_Variable.age = 19;  // Changing static variable value
        Static_Variable.age = 20;  
        Static_Variable.age = 24;  // Changing static variable directly

        // Static variables share the same memory, so all instances reflect the latest change.
        System.out.println(Static_Variable.age);  // Output: 24
    }
}