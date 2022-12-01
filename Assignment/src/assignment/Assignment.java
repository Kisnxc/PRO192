
package assignment;


import cong.util.Menu;
import data.BrandList;
import data.CarList;
import java.util.ArrayList;
import java.util.List;


public class Assignment {

    
    public static void main(String[] args) {
        Menu menu = new Menu("The manager of the showroom");
        menu.addNewOption("1- List all brands");
        menu.addNewOption("2- Add a new brand");
        menu.addNewOption("3- Search a brand based on its ID");
        menu.addNewOption("4- Update a brand");
        menu.addNewOption("5- Save brands to the file, named brands.txt");
        menu.addNewOption("6- List all cars in ascending order of brand names");
        menu.addNewOption("7- List cars based on a part of an input brand name");
        menu.addNewOption("8- Add a car");
        menu.addNewOption("9- Remove a car based on its ID");
        menu.addNewOption("10- Update a car based on its ID");
        menu.addNewOption("11- Save cars to file, named cars.txt");
        menu.addNewOption("12- Quit");
        BrandList brandList = new BrandList();
        CarList carList = new CarList(brandList);        
        brandList.loadFromFile("brands.txt");
        carList.loadFromFile("cars.txt");
        
        int choice;
        do {            
            menu.printMenu();
            choice = menu.getChoice();
            switch (choice) {
                case 1:                    
                    brandList.printList();
                    break;
                case 2:
                    brandList.addBrand();                    
                    break;
                case 3:                   
                    brandList.searchId();
                    break;
                case 4:
                    brandList.updateBrand();
                    break;
                case 5:
                    brandList.saveToFile("brands.txt");
                    System.out.println("Save file succesfully");
                    break;
                case 6:
                    carList.printCarListByAscendingBranName();
                    break;
                case 7:
                    carList.printBasedBrandName();
                    break;
                case 8:
                    carList.addCar();                    
                    break;
                case 9:                   
                    carList.removeCar();
                    break;
                case 10:
                    carList.updateCar();
                    break;
                case 11:
                    carList.saveToFile("cars.txt");
                    System.out.println("Save file succesfully");
                    break;
                case 12:
                    System.out.println("Good Bye ^_^ ");
                    break;    
                
            }
        } while (choice != 12);

    }
   
}
