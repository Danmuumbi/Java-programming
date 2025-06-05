abstract class shape{
    abstract double area();
    abstract double perimeter();

}

class circle extends shape{
    private double radius; 

    circle(double rad)
    {
        radius = rad;
    }

    double area(){
        return Math.PI*radius*radius;
    }
    double perimeter(){
        return 2* (Math.PI*radius);
    }
}

class rectangle extends shape{
    private double length;
     private double width;

     rectangle(double width, double length){
         this.width = width;
         this.length = length;
     }

     double area(){
        return length * width;
     }

     double perimeter(){
        return 2 *(length + width);
     }

}


public class abstractclass_shape {

    public static void main(String[] args) {

        // shape obj = new shape
        shape circle = new circle(5);
        System.out.println("the area f the circle "+circle.area());
        System.out.println("perimeter of the circle is "+circle.perimeter());


        shape rectangle = new rectangle(5, 6);
        System.out.println("the area of rec "+ rectangle.area());
        System.out.println("perimeter is "+ rectangle.perimeter());
    }
    
}

