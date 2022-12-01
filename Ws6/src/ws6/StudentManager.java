
package ws6;

import cong.util.Menu;
import data.StudentList;


public class StudentManager {

    
    public static void main(String[] args) {
        Menu menu = new Menu("*** Student managing Program ***");
        menu.addNewOption("1-Add new student");
        menu.addNewOption("2-Search a student");
        menu.addNewOption("3-Update name and mark");
        menu.addNewOption("4-Remove a student");
        menu.addNewOption("5-List all");
        menu.addNewOption("6-Quit");
        StudentList list = new StudentList();
        int choice;
        do {            
            menu.printMenu();
            choice = menu.getChoice();
            switch (choice) {
                case 1:
                    System.out.println("Preparing to input new student profile");
                    list.addStudent();
                    break;
                case 2:
                    
                    list.searchStudent();
                    break;
                case 3:                   
                    list.updateStudent();
                    break;
                case 4:
                    list.removeStudent();
                    break;
                case 5:
                    list.printList();
                    break;
                case 6:
                    System.out.println("Bye bye, see you next time!");
                    break;
                
            }
        } while (choice != 6);
    }
    
}
