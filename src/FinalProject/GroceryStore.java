import java.util.Scanner;
import java.util.ArrayList;
package FinalProject;

/**
 * 超市的parent class，会有各自的物品，价格，库存
 * 能够计算价格*数量
 * 能够反馈是否还有库存（quantity）
 * 顾客购买后，库存会减少
 * 有补货功能，设为一天开始的原始数量
 * 参考grocery item order
 */
public class GroceryStore {
    int product = 3;

    String[] itemName = new String[product];

    int[] itemPrice = new int[product];

    int[] itemQuantity =  new int[product];

    int[] defaultQuantity = new int[product];

    public GroceryStore() {

    }

    public int receiveOrder() {
        ArrayList<String> itemOrderNames = new ArrayList<String>();
        ArrayList<Integer> itemOrderQuantity = new ArrayList<Integer>();

        Scanner in = new Scanner(System.in);
        System.out.println("How many items you want to purchase today? ");
        System.out.println("");

        System.out.println("Please enter an item to add to the list (item-name quantity price) "
                + "Enter \"quit\" to stop adding items to the list");
        while(! in.next().equals("quit")){
             itemOrderNames.add(in.next());
             itemOrderQuantity.add(in.nextInt());
        }

        for(int i = 0; i < itemOrderNames.size(); i++){
            for(int j = 0; j < itemName.length; j++){
                if(itemOrderNames.get(i).equals(itemName[j])){
                    if((itemQuantity[j] - itemOrderQuantity.get(i) < 0 )){
                        throw new IllegalArgumentException("Item out of stock!");
                    }
                    itemQuantity[j] -= itemOrderQuantity.get(i);
                }
            }
        }


    public int getQuantity(){
        return i

    }

    public void setQuantity() {


    }

    public void restock() {


    }

    public double getPrice() {

    }

    public String toString(){

    }
}
