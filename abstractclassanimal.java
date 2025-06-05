abstract class Animal{
    abstract void makesound();
    abstract void move();

}

class cow extends Animal{
    void makesound(){
        System.out.println("Cow Moo's...");
    }

    void move(){
        System.out.println("Cow Walks");
    }
}

class snake extends Animal{
    void makesound(){
        System.out.println("A snake Hisses..");
    }

    void move(){
        System.out.println("A Snake slithers..");
    }
}

public class abstractclassanimal {

    public static void main(String [] args){
        cow myCow = new cow();
        myCow.move();
        myCow.makesound();

        System.out.println("Snake details:");

        snake mySnake = new snake();
        mySnake.makesound();
        mySnake.move();
    }
    
}
