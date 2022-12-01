
package part3;


public class Tester {
    public static void main(String[] args) {
        Guitar ob1 = new Guitar();
        Guitar ob2 = new Guitar("G123", 2000, "Sony", "Model123", "hardWood", "softWood");
        System.out.println("State of ob1: ");
        ob1.createSound();
        System.out.println("State of ob2: ");
        ob2.createSound();
        
        System.out.println("set price = 3000 of ob1");
        ob1.setPrice(3000);
        System.out.println("get price of ob1: " + ob1.getPrice());
    }
}
