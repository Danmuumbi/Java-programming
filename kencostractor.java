class InnerConstructor {

    private int number;

    // Constructor
    public InnerConstructor(int number) {
        this.number = number;
    }

    // Method to perform multiplication
    public void multiply() {
        for (int i = 1; i <= 10; i++) {
            int result = i * number;
            System.out.println(i + " * " + number + " = " + result);
        }
    }
}

public class kencostractor {
    public static void main(String[] args) {
        InnerConstructor mult = new InnerConstructor(7);
        mult.multiply();
    }
}