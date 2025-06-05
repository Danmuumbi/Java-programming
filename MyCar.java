public class MyCar {
    public String carName;
    public String carModel;

    public MyCar() {
        this.carName = "Mercedez benz";
        this.carModel = "Gwagon";
    }

    public void displayCarInfo() {
        System.out.println("Car Name: " + carName);
        System.out.println("Car Model: " + carModel);
    }

    public static void main(String[] args) {
        MyCar obj = new MyCar();
        obj.carName = "RollsRoyce";
        obj.carModel = "Phantom";
        obj.displayCarInfo();
    }
}