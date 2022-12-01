
package DTO;


public class Colony extends Organization {
    protected String place;

    public Colony() {
        
    }

    public Colony(int size, String place) {
        super(size);
        this.place = place;
    }

    @Override
    public String toString() {
        return "The Colony's size is: "+ size + "The Colony's place is: " + place;
    }
    
    @Override
    public void communicateByTool() {
        System.out.println("The colony communicate by sound");
    }
    
    public void grow() {
        System.out.println("An annual cycle of growth that begins in spring");
    }
    
    public void reproduce() {
        System.out.println("Colony can reproduce itself through a process");
    }
}
