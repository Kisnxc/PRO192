
package data;

public class Phone {
    private int phoneID;
    private String phoneName;
    private String dayOfSale;
    private int sales;

    public Phone() {
    }
    
       
    public Phone(int phoneID, String phoneName, String dayOfSale, int sales) {
        this.phoneID = phoneID;
        this.phoneName = phoneName;
        this.dayOfSale = dayOfSale;
        this.sales = sales;
    }

    public int getPhoneID() {
        return phoneID;
    }

    public void setPhoneID(int phoneID) {
        this.phoneID = phoneID;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public String getDayOfSale() {
        return dayOfSale;
    }

    public void setDayOfSale(String dayOfSale) {
        this.dayOfSale = dayOfSale;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }
    
    public void showProfile() {
        System.out.printf("|%-10d|%-20s|%-20s|%10d|\n", phoneID, phoneName, dayOfSale, sales);
    }
}
