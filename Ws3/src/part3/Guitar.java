
package part3;
/*  Class, main noun: Guitar 
    Fields: serialNumber, price, builder, model, backWood, topWood 
    Method: createSound 
    ~~~
    Class, main noun: Inventory
    Fields: theListOfGuitars (array)
    Method: addANewGuitar, searchBySerialNumber  
*/
public class Guitar {
    private String serialNumber;
    private int price;
    private String builder;
    private String model;
    private String backWood;
    private String topWood;

    public Guitar(){    
    }
    
    public Guitar(String serialNumber, int price, String builder, String model, String backWood, String topWood) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.builder = builder;
        this.model = model;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBuilder() {
        return builder;
    }

    public void setBuilder(String builder) {
        this.builder = builder;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBackWood() {
        return backWood;
    }

    public void setBackWood(String backWood) {
        this.backWood = backWood;
    }

    public String getTopWood() {
        return topWood;
    }

    public void setTopWood(String topWood) {
        this.topWood = topWood;
    }
    
    public void createSound(){
        System.out.println("serialNumber: " + getSerialNumber());
        System.out.println("price: " + getPrice());
        System.out.println("builder: " + getBuilder());
        System.out.println("model: " + getModel());
        System.out.println("backWood: " + getBackWood());
        System.out.println("topWood: " + getTopWood());
    }
}
