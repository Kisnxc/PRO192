
package data;

import cong.util.MyToys;
import java.util.ArrayList;


public class StudentList extends ArrayList<Student> {
    public StudentList() {
        super();
    }
    
    public Student search(String code) {
        code = code.trim().toUpperCase();
        for (int i = 0; i < this.size(); i++) {
            if(this.get(i).getCode().equals(code)) 
                return this.get(i);
        }
        return null;
    }
    
    private boolean isCodeDupplicated(String code) {
        code = code.trim().toUpperCase();
        return search(code) != null;
    }
    public void addStudent() {
        String newName, newCode;
        double newMark;   
        do{
            newCode = MyToys.getID("Input code: ", "Code must be SDDD (D is digits)", "[sS][\\d]{3}");
            newCode = newCode.trim().toUpperCase();
            if (isCodeDupplicated(newCode))
                System.out.println("Code is Dupplicated");
        } while (isCodeDupplicated(newCode) == true);
        newName = MyToys.getString("Input name: ", "Name is empty. Input again!!!");
        newMark = MyToys.getADouble("Input mark: ", "Mark must be 0...10", 0, 10);
        
        Student s = new Student(newCode, newName, newMark);
        this.add(s);
        System.out.println("Add " + newCode + " succesfully~~");
    }
    
    public void searchStudent() {
        if (this.isEmpty())
            System.out.println("The list is empty.Can't search @.@ ");
        else {
            String sCode = MyToys.getID("Input Studen's code to search: ", "Code must be SDDD (D is digits)", "[sS][\\d]{3}");
            Student st = search(sCode);
            if (st == null) 
                System.out.println("Student " + sCode + " doesn't existed @.@");
            else System.out.println("Here he/she is: " + st);
        }
    }
    
    public void updateStudent() {
        if (this.isEmpty())
            System.out.println("The list is empty.Can't update @.@ ");
        else {
            String sCode = MyToys.getID("Input Studen's code to update: ", "Code must be SDDD (D is digits)", "[sS][\\d]{3}");
            Student st = search(sCode);
            if (st == null) 
                System.out.println("Student " + sCode + " doesn't existed @.@");
            else{
                System.out.println("Your old name: " + st.getName());
                String newName = MyToys.getString("Input new name: ", "Name is empty. Input again!!!");
                st.setName(newName);
                System.out.println("Your old mark: " + st.getMark());
                double newMark = MyToys.getADouble("Input new mark: ", "Mark must be 0...10", 0, 10);
                st.setMark(newMark);
                System.out.println("Student " + sCode + " has been updated ^.^");
                
            }
            
        }
    }
    
    public void removeStudent() {
        if (this.isEmpty())
            System.out.println("The list is empty.Can't remove @.@ ");
        else {
            String rCode = MyToys.getID("Input Studen's code to remove: ", "Code must be SDDD (D is digits)", "[sS][\\d]{3}");
            Student st = search(rCode);
            if (st == null) 
                System.out.println("Student " + rCode + " doesn't existed @.@");
            else{
                this.remove(st);
                System.out.println("Student " + rCode + " has been removed ^.^");
            }
        }
    }
    
    public void printList() {
        if (this.isEmpty())
            System.out.println("The list is empty.Can't print list @.@ ");
        else {
            System.out.println("Student list here: ");
            for (Student thi : this) {
                
            }
            for (int i = 0; i < this.size(); i++) {
                System.out.print((i + 1) + ". ");
                this.get(i).showProfile();
                
            }
            System.out.println("Total " + this.size() + " student(s)");
        }
    }
}
