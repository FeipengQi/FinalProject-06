package FinalProject;

/**
 * 可以接单
 * 选择配送时间
 * 选择配送超市
 * 有时间status，如果有顾客选择他的time slot，就会接单
 * 配送完成的status
 */
public class Shopper {
    private GroceryStore store = new GroceryStore();
    private int startTime;
    private int endTime;
    private boolean occupied;
    private int timeLeft;
    private boolean delivered;
    private Customer customer;



    public Shopper(GroceryStore store, int startTime, int endTime) {
      this.store = store;
      this.startTime = startTime;
      this.endTime = endTime;
      this.timeLeft = 2;
    }

    public int getStartTime(){
      return this.startTime;
    }
    public int getEndTime(){
      return this.endTime;
    }

    public boolean isOccupied(){
      return this.occupied;
    }

    public void Delivering(){
      this.timeLeft--;
    }

    public void startDelivery(Customer customer) {
      this.occupied = true;
      this.customer = customer;
    }

    public boolean isDelivered(){
        if(this.timeLeft >= 0){
            return false;
        }
        return true;
    }

    public boolean delivered(){
        this.delivered = true;
    }

    public void approaching(){
        this.timeLeft--;
    }

    public Customer get
}
