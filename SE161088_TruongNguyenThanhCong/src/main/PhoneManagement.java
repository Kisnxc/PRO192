
package main;

import cong.util.Menu;
import data.Phone;
import data.PhoneList;


public class PhoneManagement {

    
    public static void main(String[] args) {
        Menu menu = new Menu("~~~ Phone Store ~~~");
        menu.addNewOption("1- List all phone with Sales in ascending order");
        menu.addNewOption("2- Add a new phone");
        menu.addNewOption("3- Find a phone based on its ID");       
        menu.addNewOption("4- Quit");
        Phone p1 = new Phone(111, "IP 11 Pro Max", "11-11-2021", 111);
        Phone p2 = new Phone(222, "IP 12 Pro Max", "12-12-2021", 22);
        Phone p3 = new Phone(333, "IP 13 Pro Max", "13-3-2021", 3);
        Phone p4 = new Phone(444, "IP 14 Pro Max", "14-4-2021", 400);
        Phone p5 = new Phone(555, "IP 15 Pro Max", "15-5-2021", 555);
        PhoneList phoneList = new PhoneList();
        phoneList.add(p1);
        phoneList.add(p2);
        phoneList.add(p3);
        phoneList.add(p4);
        phoneList.add(p5);
        
        int choice;
        do {            
            menu.printMenu();
            choice = menu.getChoice();
            switch (choice) {
                case 1:                    
                    phoneList.printListBySale();
                    break;
                case 2:
                    phoneList.addPhone();
                    break;
                case 3:                   
                    phoneList.searchId();
                    break;
                case 4:
                    System.out.println("Good Bye ^_^ ");
                    break;
            }
        } while (choice != 4);
    }
    
}
