package FinalProject;

/**
 * 参考grocery item list
 */
public class Customer {

    private int timeSlot;
    private GroceryStore store;
    private boolean orderInProgress;
    private int hoursLeft = 2;

    public Customer(){
        this.hoursLeft = 2;
    }
    public Customer(GroceryStore store, int timeSlot){
      this.store = store;
      this.timeSlot = timeSlot;
    }

    public int getTimeSlot(){
      return this.timeSlot;
    }

    public getGroceryStore(){
      return this.store;
    }

    public void hasOrderInprogress(){
        this.orderInprogress = true;
    }

    public boolean delivered(){
        if(this.hourseLeft >= 0){
            return false;
        }
        return true;
    }

    public void approaching(){
        this.hoursLeft--;
    }

}
