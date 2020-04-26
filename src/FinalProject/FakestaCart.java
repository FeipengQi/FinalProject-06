package FinalProject;
import java.util.*;
public class FakestaCart {
    public static void main(String[] args){
        GroceryStore marketBasket = new MarketBasket();
        GroceryStore cvs = new CVS();
        Scanner console = new Scanner(System.in);
        System.out.println("Welcome to FakestaCart. Our stores would open from 9:00 to 18:00.");
        System.out.println("How many shoppers are available today?");
        Shopper[] shoppers = new Shopper[console.nextInt()];
        //record shopper's info
        for(int i = 0; i < shoppers.length; i++){
            System.out.println("Please enter shopper " + (i + 1) +
                    "'s available store (Market Basket/CVS), starting time, and ending time, with space in b/w: ");
            String store = console.next();
            if (store.equals("Market Basket")){
                shoppers[i] = new Shopper(marketBasket, console.nextInt(), console.nextInt());
            } else if(store.equals("CVS")){
                shoppers[i] = new Shopper(cvs, console.nextInt(), console.nextInt());
            } else throw new NoSuchElementException();
        }

        ArrayList<Customer> customers = new ArrayList<Customer>();
        System.out.println("How many customers are in queue? ");
        for(int i = 0; i < console.nextInt(); i++){
            System.out.println("Hi, Which store do you want to shop today? ");
            String store = console.next();
            do{
                System.out.println("Please select a slot: ");
            }while()
            Customer customer;
            if (store.equals("Market Basket")){
                customer = new Customer(marketBasket, console.nextInt());
            } else if(store.equals("CVS")){
                customer = new Customer(cvs, console.nextInt());
            } else throw new NoSuchElementException();
            System.out.println("Please enter an item to add to the list (item-name quantity price) \n " +
                    "Enter \"quit\" to stop adding items to the list. You can only have 10 items in the list \n ");
            store.receiveOrder();
        }

        for(int i = 9; i <= 18; i++){
            if (customers.size() > 0){
                for(int j = 0; j < customers.size(); j++){
                    Customer curr_customer = customers.get(j);
                    if(curr_customer.getTimeSlot() == i){
                        for(int k = 0; k < shoppers.length; k++){
                            //equals method
                            if(shoppers[k].getStore() == curr_customer.getStore()) {
                                if (!shoppers[k].getOccupied() &&
                                        shoppers[k].getStartTime() <= curr_customer.getTimeSlot() <= shoppers[k].getEndTime()) {
                                    shoppers[k].startDelivering();
                                    curr_customer.hasOrderInProgress();
                                }
                            }
                        }
                    } else if(curr_customer.inProgress() && ! curr_customer.delivered()) {
                        curr_customer.approaching();
                    } else if(curr_customer.delivered()){
                        System.out.println("Customer #" + j + "'s order is delivered");
                        customers.remove(j);
                    }
                }
            }
        }
        marketbasket.restock();
        cvs.restock();
    }
}
