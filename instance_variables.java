public class instance_variables {
    public static int age;
    public String name;


    instance_variables(int a , String n){
         age = a;
         name = n;
    }

    public static void main(String args [] ){
        instance_variables carobj = new instance_variables(19, "Muuo");
        System.out.println("my name is " +carobj.name);
        System.out.println("i am "+ instance_variables.age+" years old");
    }
    
}
