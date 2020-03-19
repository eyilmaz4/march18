package march18Codes;

public class CoffeeMaker_Test {
    public static void main(String[] args) {
    CoffeeMaker myCoffeeMaker=new CoffeeMaker(32, "12:59:59",true);
        System.out.println(myCoffeeMaker.toString());
    myCoffeeMaker.setTheTimer("00:01:30");
    System.out.println(myCoffeeMaker.getTimer());

    }
}
