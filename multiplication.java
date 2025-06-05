class InnerMultiplication {
    private int number;

    
    public InnerMultiplication(int number) {
        this.number = number;
    }

    public void multipli() {
        for (int i = 1; i <= 10; i++) {
            int result = i * number;
            System.out.println(i + " * " + number + " = " + result);
        }
    }
}

public class multiplication {
    public static void main(String[] args) {
        
        InnerMultiplication mult = new InnerMultiplication(7);
        mult.multipli();
    }
}
