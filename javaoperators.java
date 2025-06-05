public class javaoperators {
    public static void main(String[] args){
        int a = 10, b = 20;

        System.out.println("arithmetic operators");
        System.out.println(a + " + " + b + " = " + (a+b));
        System.out.println(a + " * " + b + " = " + (a*b));
        System.out.println(a + " / " + b + " = " + ((double)a/b));
        System.out.println(a + " % " + b + " = " + (a%b));


        System.out.println("Relational Operators");
        System.out.println("a is " + a + " and b is " + b);

        // == operator
        System.out.println(a == b);  // false

        // != operator
        System.out.println(a != b);  // true

       // > operator
       System.out.println(a > b);  // false

       // < operator
       System.out.println(a < b);  // true

       // >= operator
       System.out.println(a >= b);  // false

       // <= operator
       System.out.println(a <= b);  // true


       System.out.println("Logical Operators");
           // && operator
    System.out.println((5 > 3) && (8 > 5));  // true
    System.out.println((5 > 3) && (8 < 5));  // false

    // || operator
    System.out.println((5 < 3) || (8 > 5));  // true
    System.out.println((5 > 3) || (8 < 5));  // true
    System.out.println((5 < 3) || (8 < 5));  // false

    // ! operator
    System.out.println(!(5 == 3));  // true
    System.out.println(!(5 > 3));  // false

    }
    
}
