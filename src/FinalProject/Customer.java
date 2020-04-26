package FinalProject;

/**
 * 参考grocery item list
 */
public class Customer {

    private int timeSlot;
    private GroceryStore store = new GroceryStore();

    public Customer(){

    }
    public Customer(GroceryStore store, int timeSlot){

    }

    public getTimeSlot(){
      return this.timeSlot;
    }

    public getGroceryStore(){
      return this.store; 
    }

    public void addItem(){

    }
}
