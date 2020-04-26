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

    public Shopper(GroceryStore store, int startTime, int endTime) {
      this.store = store;
      this.startTime = startTime;
      this.endTime = endTime;
      this.occupied = false;
    }

    public boolean getOccupied(){
      return this.occupied;
    }


    public void startDelivering(){
      this.occupied = true;
    }

    public int getStartTime(){
      return this.getStartTime;
    }

    public int getEndTime(){
      return this.getEndTime;
    }

    public getGroceryStore(){
      return this.store; 
    }

    public void delivered(){
      return this.occupied = false;
    }



}
