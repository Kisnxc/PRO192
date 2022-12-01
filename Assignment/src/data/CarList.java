
package data;

import data.BrandList;
import cong.util.Menu;
import cong.util.MyToys;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;


public class CarList extends ArrayList<Car>{
    private BrandList branList;
    

    

    public CarList(BrandList branList) {
        super();
        this.branList = branList;
    }
    
    public CarList() {
        
    }
    
    

    public String screenString() {
        return this.get(modCount).brand + "\n" + this.get(modCount).carId 
                + "," + this.get(modCount).color  + "," + this.get(modCount).frameId 
                + "," + this.get(modCount).engineId;
    }

    public boolean loadFromFile(String fileName)  {
        try {
            File f = new File(fileName);
            if(f.exists() == false ) return false; 
            else {
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String details;
                while ((details = br.readLine()) != null) {                    
                    StringTokenizer stk = new StringTokenizer(details, ",");
                    String name = stk.nextToken().trim();
                    String brandId = stk.nextToken().trim();
                    String color = stk.nextToken().trim();
                    String frameId = stk.nextToken().trim();
                    String engineId = stk.nextToken().trim();
                    int pos = branList.searchId(brandId);
                    Brand b = branList.get(pos);
                    Car c = new Car(name, b, color, frameId, engineId);
                    this.add(c);
            }
            br.close();
            fr.close();
        }
        } catch (Exception e) {
            System.out.println("Something wrong");    
        }
        
        return true;
    }
   
    public boolean saveToFile(String fileName) {
        if(this.size() == 0) {
            System.out.println("Empty list");
            return true;
        }
        try {
            File f = new File(fileName);
            FileWriter fw = new FileWriter(f);
            PrintWriter pw = new PrintWriter(fw);
            for (Car x : this) {
                pw.println(x.carId + ", " + x.brand.getBrandId() + ", " + x.color + ", " + x.frameId + ", " + x.engineId);
                
            }
            pw.close();
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return true;
    }
    
    public int searchId(String carId) {
        carId = carId.trim().toUpperCase();
        for (int i = 0; i < this.size(); i++) {
            if(this.get(i).carId.equals(carId))
                return i;
        }
        return -1;
    }
    
    public int searchFrame(String fId) {
        fId = fId.trim().toUpperCase();
        for (int i = 0; i < this.size(); i++) {
            if(this.get(i).frameId.equals(fId))
                return i;
        }
        return -1;
    }
    
    public int searchEngine(String eId) {
        eId = eId.trim().toUpperCase();
        for (int i = 0; i < this.size(); i++) {
            if(this.get(i).engineId.equals(eId))
                return i;
        }
        return -1;
    }
    
    public void addCar() {
        String newCarId, newColor, newFrame, newEnige;
        Brand b;
        do {            
            newCarId = MyToys.getString("Input new car id: ", "Id can't be blank");
            newCarId = newCarId.trim().toUpperCase();
            if(searchId(newCarId) != -1)
                System.out.println("Id is dupplicated");
        } while (searchId(newCarId) != -1);
        
        for (int i = 0; i < branList.size(); i++) {
            System.out.println((i+1) + "-" + branList.get(i).getBrandId());
        }
        int a = MyToys.getAnInteger("Input your choice: ", "Input again!!!", 1, branList.size());
        b = branList.get(a-1);
               
        
        newColor = MyToys.getString("Input new color: ", "Color can't be blank");
        
        do {
            newFrame = MyToys.getID("Input new Frame: ", "Frame must be Fxxxxx(x is digits)", "[fF][\\d]{5}");
            newFrame = newFrame.trim().toUpperCase();
            if(searchFrame(newFrame) != -1)
                System.out.println("Frame is dupplicated");
        } while (searchFrame(newFrame) != -1);
        
        do {            
            newEnige = MyToys.getID("Input new Engine: ", "Engine must be Exxxxx(x is digits)", "[eE][\\d]{5}");
            newEnige = newEnige.trim().toUpperCase();
            if(searchEngine(newEnige) != -1)
                System.out.println("Enige is dupplicated");
        } while (searchEngine(newEnige) != -1);
        
        Car c = new Car(newCarId, b, newColor, newFrame, newEnige);
        this.add(c);
    }
    
    public void printBasedBrandName() {
        String brandName = MyToys.getString("Input brand name: ", "Brand name can't be blank");
        int count = 0;
        Car c;
        for (int i = 0; i < this.size(); i++) {
            c = this.get(i);
            if (c.getBrand().getBrandName().contains(brandName) == true) {
                c.screenString();
                count ++; 
            }        
        }
        if (count == 0) 
            System.out.println("No car is detected ~.~");
                         
    }
    public boolean removeCar() {
        if (this.isEmpty())
            System.out.println("The list is empty.Can't removed @.@ ");
        else {                    
            String id = MyToys.getString("Input car id to removed: ", "Id can't be blank").trim().toUpperCase();
            if(searchId(id) == -1)                            
                System.out.println("Id doesn't exist");
            else {
                this.remove(searchId(id));
                System.out.println("The car " + id + " has been removed");
            }       
        }
        return true;
    }
    
    public void printCarListByAscendingBranName() {
        if (this.isEmpty()){
            System.out.println("The list is empty.Can't removed @.@ ");
            return;
        }
        Comparator a = new Comparator<Car>() {
            

            @Override
            public int compare(Car o1, Car o2) {
                return o1.brand.getBrandName().compareToIgnoreCase(o2.brand.getBrandName());
            }
        };
   
        Collections.sort(this, a);
        System.out.println("-------------------------------------------------");
        System.out.println("List all cars in ascending order of brand names: ");
        for (Car x : this) {
            x.screenString();
        }
    }
    public boolean updateCar() {
        String newFrame, newEngine, id;
        if (this.isEmpty()) {
            System.out.println("The list is empty.Can't update @.@ ");
        } else {
            id = MyToys.getString("Input car id to update: ", "Id can't be blank").trim().toUpperCase();
            if (searchId(id) == -1) {
                System.out.println("Id doesn't exist");
            } else {
                Brand newBrand;
                for (int i = 0; i < branList.size(); i++) {
                    System.out.println((i + 1) + "-" + branList.get(i).getBrandId());
                }
                int a = MyToys.getAnInteger("Input your choice to update brand: ", "Input again!!!", 1, branList.size());
                newBrand = branList.get(a-1);
                this.get(searchId(id)).setBrand(newBrand);
                String newColor = MyToys.getString("Input color to update your car: ", "Color can't be blank");
                this.get(searchId(id)).setColor(newColor);
                do {
                    newFrame = MyToys.getID("Input new Frame: ", "Frame must be Fxxxxx(x is digits)", "[fF][\\d]{5}");
                    
                    if (searchFrame(newFrame) != -1)
                    System.out.println("Frame is dupplicated");
                } while ((searchFrame(newFrame)) != -1);
                this.get(searchId(id)).setFrameId(newFrame);
                do {
                    newEngine = MyToys.getID("Input new Enige: ", "Enige must be Exxxxx(x is digits)", "[eE][\\d]{5}");
                    if (searchEngine(newEngine) != -1) 
                        System.out.println("Enige is dupplicated");                    
                } while (searchFrame(newEngine) != -1);
                this.get(searchId(id)).setEngineId(newEngine);
                
                System.out.println("The car " + id + " has been updated");
                
            }
        }

        return true;
    }
    public void printList() {
        if (this.isEmpty())
            System.out.println("The list is empty.Can't print list @.@ ");
        else {
            System.out.println("Car list here: ");
            for (Car c : this) {
                c.printACar();
            }
        }
    }
}
