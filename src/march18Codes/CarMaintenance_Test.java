package march18Codes;

public class CarMaintenance_Test {
    public static void main(String[] args) {
        CarMaintenance myCar=new CarMaintenance("Honda", 300, 400, "Clean", "clean", "clean");
        System.out.println(myCar.toString());
        myCar.display();
    }
}
