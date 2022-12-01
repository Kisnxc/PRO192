
package data;


public class Car implements Comparable<Car>{
    protected String carId;
    protected Brand brand;
    protected String color;
    protected String frameId;
    protected String engineId;

    public Car(String carId, Brand brand, String color, String frameId, String engineId) {
        this.carId = carId;
        this.brand = brand;
        this.color = color;
        this.frameId = frameId;
        this.engineId = engineId;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFrameId() {
        return frameId;
    }

    public void setFrameId(String frameId) {
        this.frameId = frameId;
    }

    public String getEngineId() {
        return engineId;
    }

    public void setEngineId(String engineId) {
        this.engineId = engineId;
    }

    @Override
    public String toString() {
        return "Car{" + "carId=" + carId + ", brand=" + brand + ", color=" + color + ", frameId=" + frameId + ", engineId=" + engineId + '}';
    }

    @Override
    public int compareTo(Car o) {
        int d = this.brand.getBrandName().compareTo(o.brand.getBrandName());
        if (d != 0)
            return d;
        return this.carId.compareTo(o.carId);
    }

    public void screenString() {
        System.out.printf("%-25s\n |%-8s|%-8s|%-10s|%10s| \n", brand.getBrandName(), carId, color, frameId,engineId );
    }
    
    public void printACar() {
        System.out.printf("|%-8s|%-8s|%-10s|%10s|%10s|\n",carId,brand.getBrandId(),color,frameId,engineId);
    }        
}
