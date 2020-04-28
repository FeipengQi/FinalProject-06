package FinalProject;

/**
 * 参考grocery item list
 */
public class Customer {

    private int timeSlot;
    private GroceryStore store;
    private boolean orderInProgress;

    public Customer(GroceryStore store, int timeSlot){
      this.store = store;
      this.timeSlot = timeSlot;
      this.hoursLeft = 2;
    }

    public int getTimeSlot(){
      return this.timeSlot;
    }

    public getGroceryStore(){
      return this.store;
    }





}
