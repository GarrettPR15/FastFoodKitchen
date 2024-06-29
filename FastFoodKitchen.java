/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fastfoodkitchen;
import java.util.ArrayList;

/**
 *
 * @author Garrett
 */
public class FastFoodKitchen {
    private ArrayList<BurgerOrder> orderList = new ArrayList<BurgerOrder>();
    private static int nextOrderNum = 1; 
   
    /**
     * Returns the value assigned to nextOrderNum
     * @return 
     */
    public int getNextOrderNum(){
        return nextOrderNum;
    }
    
    /**
     * Adds one to the variable nextOrderNum
     */
    private static void incrementNextOrderNum(){
        nextOrderNum++;
    }
    
    public FastFoodKitchen(){
        BurgerOrder order1 = new BurgerOrder(3, 5, 4, 10, false, getNextOrderNum());
        incrementNextOrderNum();
        BurgerOrder order2 = new BurgerOrder(0, 0, 3, 3, true, getNextOrderNum());
        incrementNextOrderNum();
        BurgerOrder order3 = new BurgerOrder(1, 1, 0, 2, false, getNextOrderNum());
        incrementNextOrderNum();
        
        orderList.add(order1);
        orderList.add(order2);
        orderList.add(order3);
    }
    
    /**
     * Creates and adds a new order to the orderList
     * @param ham
     * @param cheese
     * @param veggie
     * @param soda
     * @param toGo
     * @return 
     */
    public int addOrder(int ham, int cheese, int veggie, int soda, boolean toGo){
        BurgerOrder x = new BurgerOrder(ham, cheese, veggie, soda, toGo, nextOrderNum);
        orderList.add(x);
        incrementNextOrderNum();
        return x.getOrderNum();
    }
    
    /**
     * Cancels the previous the last order in the list
     * @return 
     */
    public boolean cancelLastOrder(){
        if (orderList.size() > 0){
            orderList.remove(orderList.size()-1);
            nextOrderNum--;
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Returns the number of orders pending
     * @return 
     */
    public int getNumOrdersPending(){
        return orderList.size();
    }

    @Override
    public String toString() {
        return "FastFoodKitchen{" + "orderList=" + orderList + '}';
    }
    
    public int isOrderDone(int orderID){
        int done = 0;
        for (int i = 0; i < orderList.size(); i++){
            if (orderList.get(i).getOrderNum() == orderID){
                done = 1;
                break;
            } else {
                done = 0;
            }
        }
        return done;
    }
    
    public int cancelOrder(int orderID){
        int cancel = 0;
        int index = 0;
        for (int i = 0; i < orderList.size(); i++){
            if (orderList.get(i).getOrderNum() == orderID){
                orderList.remove(i);
                cancel = 1;
                break;
            } else {
                cancel = 0;
            }
        }
        return cancel;
    }
    
}
