class Square {
    public int square(int a) {
        return a * a;
    }
}

public class squareA {
    public static void main(String[] args) {
        Square squareObj = new Square();
        int result = squareObj.square(5); 
        System.out.println("The square of 5 is: " + result);
    }
}
