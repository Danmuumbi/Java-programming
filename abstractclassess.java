abstract class Animal{
    abstract void makeSound();
    abstract void movement();
}

class cow extends Animal{
    void makeSound(){
        System.out.println("moo...");
    }
    void movement(){
        System.out.println("cow walks");
    }
}

class snake extends Animal{
    void makeSound(){
        System.out.println("Snake hisses");
    }

    void movement(){
        System.out.println("slitherig");
    }
}


public class abstractclassess {
    public static void main(String[] args) {
        cow mycow =  new cow();
        snake mySnake = new snake();
        mycow.makeSound();
        mycow.movement();
        mySnake.makeSound();
        mySnake.movement();

    }
 
    
}
