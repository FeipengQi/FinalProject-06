import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
package FinalProject;

import java.util.Arrays;
import java.util.Scanner;
/**
 * 超市的parent class，会有各自的物品，价格，库存
 * 能够计算价格*数量
 * 能够反馈是否还有库存（quantity）
 * 顾客购买后，库存会减少
 * 有补货功能，设为一天开始的原始数量
 * 参考grocery item order
 *
 */
public class GroceryStore {

    String[] itemName = {"A","B","C"};

    int[] itemPrice = {1,2,3};

    int[] itemQuantity = {20,20,20};

    int[] defaultQuantity = {20,20,20};

    public GroceryStore(){

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
            // itemOrderNames.add(console.next());
            // itemOrderQuantity.add(console.nextInt());
        }

        for(int i = 0; i < itemOrderNames.length; i++){
            for(int j = 0; j < itemName.length; j++){
                if(itemOrderNames[i].equals(itemName[j])){
                    if((itemQuantity[j] - itemOrderQuantity[i] < 0 ){
                        throw new IllegalArgumentException("Item out of stock!");
                    }
                    itemQuantity[j] -= itemOrderQuantity[i];
                }
            }
        }

    public int receiveOrder(){
        String[] itemOrderNames = new String[];
        int[] itemOrderQuantity = new int[];

        Scanner in = new Scanner(System.in);
        System.out.println("How many items you want to purchase today? ");
        String[] itemOrderNames = new String[in.nextInt()];
        System.out.println("Please enter an item to add to the list (item-name quantity price) "
                + "Enter \"quit\" to stop adding items to the list");
        while(! in.next().equals("quit")){
            // itemOrderNames.add(console.next());
            // itemOrderQuantity.add(console.nextInt());
        }

        for(int i = 0; i < itemOrderNames.length; i++){
            for(int j = 0; j < itemName.length; j++){
                if(itemOrderNames[i].equals(itemName[j])){
                    if((itemQuantity[j] - itemOrderQuantity[i] < 0 ){
                        throw new IllegalArgumentException("Item out of stock!");
                    }
                    itemQuantity[j] -= itemOrderQuantity[i];
                }
            }
        }

    }

    public int getQuantity(){

        return itemQuantity[receiveOrder()];
    }

    public void setQuantity(){

        return itemQuantity[receiveOrder()-];

    }

    public int getTotalCosts(){

    }


    public void restock(){


    }

    public double getPrice(){

    }

    public String toString(){

    }
}
