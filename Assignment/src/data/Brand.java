
package data;

public class Brand {
    private String brandId;
    private String brandName;
    private String soundBrand;
    private double price;
    public Brand() {
        
    }
    
    public Brand(String brandId, String brandName, String soundBrand, double price) {
        this.brandId = brandId;
        this.brandName = brandName;
        this.soundBrand = soundBrand;
        this.price = price;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getSoundBrand() {
        return soundBrand;
    }

    public void setSoundBrand(String soundBrand) {
        this.soundBrand = soundBrand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Brand{" + "brandId=" + brandId + ", brandName=" + brandName + ", soundBrand=" + soundBrand + ", price=" + price + '}';
    }
    
    public void printABrand(){
        System.out.printf("|%-8s|%-30s|%-20s|%7.3f|\n",brandId,brandName,soundBrand,price);
    }
}
