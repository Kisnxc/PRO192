
package data;

import cong.util.MyToys;
import java.util.ArrayList;


public class PhoneList extends ArrayList<Phone>{
    
    
    public int searchId(int id) {       
        for (int i = 0; i < this.size(); i++) {
            if(this.get(i).getPhoneID()==id)             
                return i;           
        }
        return -1;
    }
    
    public void searchId() {
        int id;
        if (this.isEmpty()) {
            System.out.println("The list is empty.Can't search @.@ ");
        } else {
            id = MyToys.getAnInteger("Input Phone ID: ", "Phone id must be integer");           
            if (searchId(id) != -1) {
                System.out.println("The phone you want to fine Here =))");
                System.out.printf("|%-10s|%-20s|%-20s|%10s|\n","Phone Id", "Phone Name","Day of Sale","Sales");
                this.get(searchId(id)).showProfile();
            } else 
                System.out.println("Can't find the phone " + id);           
        }
    }
    
    public void addPhone() {
        String newPhoneName,newDayofSale;
        int newSales, newPhoneId;
        
        do {            
            newPhoneId = MyToys.getAnInteger("Input new phone id: ", "Phone id must be integer");
            
            if(searchId(newPhoneId) != -1)
                System.out.println("Id is dupplicated");
        } while (searchId(newPhoneId) != -1);
        
        newPhoneName = MyToys.getString("Input new phone name: ", "Name can't be blank");
        newDayofSale = MyToys.getString("Input new day of sale: ", "Day of sale can't be blank");
        newSales = MyToys.getAnInteger("Input new sales: ", "Sales id must be integer");
        Phone b = new Phone(newPhoneId, newPhoneName, newDayofSale, newSales);
        this.add(b);
        System.out.println("Add " + newPhoneId +" succesful");
    }
    
    
    
    public void printListBySale() {
        if (this.isEmpty())
            System.out.println("The list is empty.Can't print list @.@ ");
        else {
            for (int i = 0; i < (this.size() - 1); i++) 
                for (int j = i+1; j < this.size(); j++) 
                    if(this.get(i).getSales() >= this.get(j).getSales()){
                        Phone p = this.get(i);
                        this.set(i, this.get(j));
                        this.set(j, p);
                    }                        
            System.out.println("The Phone list with Sale in ascending order: ");
            System.out.printf("|%-10s|%-20s|%-20s|%10s|\n","Phone Id", "Phone Name","Day of Sale","Sales");
            for (Phone x : this) {     
                x.showProfile();
            }
            
            }
        }
    
}
