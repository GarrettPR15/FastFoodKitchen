/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fastfoodkitchen;

/**
 *
 * @author Garrett
 */
public class BurgerOrder {
    private int numHamburgers = 0;
    private int numCheesburgers = 0;
    private int numVeggieburgers = 0;
    private int numSodas = 0;
    private boolean orderToGo = false;
    private int orderNum = 1;
    
    public BurgerOrder(int ham, int cheese, int veggie, int sodas, boolean toGo, int number){
        numHamburgers = ham;
        numCheesburgers = cheese;
        numVeggieburgers = veggie;
        numSodas = sodas;
        orderToGo = toGo;
        orderNum = number;
    }
    
    //gets the order number
    public int getOrderNum(){
        return orderNum;
    }
    
    //sets the order number
    public void setOrderNum(int number){
        orderNum = number;
    }
    
    //returns if the order is to go
    public boolean isOrderToGo(){
        return orderToGo;
    }
    
    //sets if the order is to go
    public void setOrderToGo(boolean toGo){
        orderToGo = toGo;
    }
    
    //gets the number of hamburgers
    public int getHamburgers(){
        return numHamburgers;
    }
    
    //sets the number of hamburgers
    public void setHamburgers(int amount){
        if(amount < 0){
            System.out.println("Error: Invalid number of hamburgers");
        } else {
            numHamburgers = amount;
        }
    }
    
    //gets the number of cheeseburgers
    public int getCheeseburgers(){
        return numCheesburgers;
    }
    
    //sets the number of cheeseburgers
    public void setCheeseburgers(int amount){
        if(amount < 0){
            System.out.println("Error: Invalid number of hamburgers");
        } else {
            numCheesburgers = amount;
        }
    }
    
    //gets teh number of veggie burgers
    public int getVeggieburgers(){
        return numVeggieburgers;
    }
    
    //sets the number of veggie burgers
    public void setVeggieburgers(int amount){
        if(amount < 0){
            System.out.println("Error: Invalid number of hamburgers");
        } else {
            numVeggieburgers = amount;
        }
    }
    
    //gets the number of sodas
    public int getSodas(){
        return numSodas;
    }
    
    //sets the number of sodas
    public void setSodas(int amount){
        if(amount < 0){
            System.out.println("Error: Invalid number of hamburgers");
        } else {
            numSodas = amount;
        }
    }

    @Override
    public String toString() {
        return "BurgerOrder{" + "numHamburgers=" + numHamburgers + ", numCheesburgers=" + numCheesburgers + ", numVeggieburgers=" + numVeggieburgers + ", numSodas=" + numSodas + ", orderToGo=" + orderToGo + ", orderNum=" + orderNum + '}';
    }
    
}
