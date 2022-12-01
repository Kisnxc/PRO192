
package data;

import cong.util.Menu;
import cong.util.MyToys;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BrandList extends ArrayList<Brand>{

    public BrandList() {
        super();
    }
    
    
    
    
    public boolean loadFromFile(String fileName) {
        try{
            File f = new File(fileName);
            if(f.exists() == false ) return false; 
            else {
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String details;
                while ((details = br.readLine()) != null) {                    
                    StringTokenizer stk = new StringTokenizer(details, ",");          
                    String brandId = stk.nextToken().trim();
                    String brandName = stk.nextToken().trim();
                    String a = stk.nextToken().trim();  
                    String[] spilit = a.split(":");
                    String soundBrand = spilit[0].trim();
                    double price = Double.parseDouble(spilit[1]);
                    Brand b = new Brand(brandId, brandName, soundBrand, price);
                    this.add(b);
                }
                br.close();
                fr.close();
            }
            
        } catch(Exception e) {
            System.out.println("Somthing wrong ~~~");
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
            for (Brand x : this) {
                pw.println(x.getBrandId() + ", " + x.getBrandName() + ", "
                        + x.getSoundBrand() + ":" + x.getPrice());
            }
            pw.close();
            fw.close();
        } catch (Exception e) {
            System.out.println(e);    
        }
        return true;
    }
    
    public int searchId(String bId) {
        bId = bId.trim().toUpperCase();
        for (int i = 0; i < this.size(); i++) {
            if(this.get(i).getBrandId().equals(bId))
                return i;
        }
        return -1;
    }
    
    public void searchId() {
        String id;
        if (this.isEmpty()) {
            System.out.println("The list is empty.Can't search @.@ ");
        } else {
            id = MyToys.getString("Input id to search: ", "Id can't be blank");
            id = id.trim().toUpperCase();
            if (searchId(id) != -1) {
                System.out.println("The brand you want to fine Here =))");
                this.get(searchId(id)).printABrand();
            } else 
                System.out.println("Can't find the brand " + id);           
        }
    }
    public void addBrand() {
        String newBrandId, newBrandName,newSoundBrand;
        double newPrice;
        do {            
            newBrandId = MyToys.getString("Input new id: ", "Id can't be blank");
            newBrandId = newBrandId.trim().toUpperCase();
            if(searchId(newBrandId) != -1)
                System.out.println("Id is dupplicated");
        } while (searchId(newBrandId) != -1);
        
        newBrandName = MyToys.getString("Input new name: ", "Name can't be blank");
        newSoundBrand = MyToys.getString("Input new sound: ", "Sound can't be blank");
        newPrice = MyToys.getADoubleGreater("Input new price: ", "Price must be positive real numbers", 0);
        Brand b = new Brand(newBrandId, newBrandName, newSoundBrand, newPrice);
        this.add(b);
    }
    
    public void updateBrand() {
        if (this.isEmpty())
            System.out.println("The list is empty.Can't update @.@ ");
        else {
            String newBrandId = MyToys.getString("Input id to update: ", "Id can't be blank");
            newBrandId = newBrandId.trim().toUpperCase();
            if(searchId(newBrandId) == -1)
                System.out.println("Brand " + newBrandId + " doesn't exist");
            else {
                String newBrandName = MyToys.getString("Input new name to update: ", "Name can't be blank");
                this.get(searchId(newBrandId)).setBrandName(newBrandName);
                String newSoundBrand = MyToys.getString("Input new sound to update: ", "Sound can't be blank");
                this.get(searchId(newBrandId)).setSoundBrand(newSoundBrand);
                double newPrice = MyToys.getADoubleGreater("Input new price to update: ", "Price must be positive real numbers", 0);
                this.get(searchId(newBrandId)).setPrice(newPrice);
                System.out.println("Brand " + newBrandId + " has been updated");
                
            }
        }
    }
    
    public void printList() {
        if (this.isEmpty())
            System.out.println("The list is empty.Can't print list @.@ ");
        else {
             System.out.println("Brand list here: ");
             for (Brand x : this) {
                 x.printABrand();
             }
        }
    }
}

