abstract class family{
    abstract void maried();
    abstract int famillySize();
    public boolean marriageC = true;
}


class mariageStatus extends  family{
    void maried(){
        
        if (marriageC == true) {
            System.out.println("this familly is officially married.");
            
        }
        else{
            System.out.println("They need to marry officially.");
        }
    }

    int famillySize(){
        int fathers = 1;
        int mothers = 1;
        int child = 6;
        if (marriageC == true) {
            return fathers + mothers + child;
            
        }
        else{
            return 0;
        }
    }


}



public class abstractstudent {

    public static void main(String[] args) {
        family mFamily = new mariageStatus();

        mFamily.maried();
        

        if (mFamily.famillySize()<= 1) {
            System.out.println("Not a family ");
            
        }

        else{

            System.out.println("my family has "+mFamily.famillySize()+" members");
        }
    }
    
}
