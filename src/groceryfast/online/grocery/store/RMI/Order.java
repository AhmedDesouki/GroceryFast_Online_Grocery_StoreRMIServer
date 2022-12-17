/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groceryfast.online.grocery.store.RMI;

import java.util.ArrayList;

/**
 *
 * @author Farid
 */
public class Order {
    
    //Attributes:
    private int OrderID;
    private float TotalPrice;
    private String Date;
    private OrderState CurrentState;
    private ArrayList <Item> items;
    private int i1;
    

    //Constructor:
    public Order(int OrderID, float TotalPrice, String Date, ArrayList<Item> items) {
        this.OrderID = OrderID;
        this.TotalPrice = TotalPrice;
        this.Date = Date;
        this.items = items;
    }
    
    //Methods:
    public void PlaceOrder(Order O){
    if(O.CurrentState == null){
    O.setCurrentState(new PlaceOrder(O));
    System.out.println("Order has been placed successfully.");
    }
    else{
        System.out.println("Order already placed.");

    }
    }
    
    public void CancelOrder(Order O){
        
    System.out.println("Cannot cancel an order that hasn't been placed yet");
        
    }

    @Override
    public String toString() {
        return "Order{" + "OrderID=" + OrderID + ", TotalPrice=" + TotalPrice + ", Date=" + Date + ", CurrentState=" + CurrentState + ", items=" + items + '}';
    }
    
    //Setters:
    public void setOrderID(int OrderID) {
        this.OrderID = OrderID;
    }

    public void setTotalPrice(float TotalPrice) {
        this.TotalPrice = TotalPrice;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public void setCurrentState(OrderState CurrentState) {
        this.CurrentState = CurrentState;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
    
    //Getters:
    public int getOrderID() {
        return OrderID;
    }

    public float getTotalPrice() {
        return TotalPrice;
    }

    public String getDate() {
        return Date;
    }

    public OrderState getCurrentState() {
        return CurrentState;
    }

    public ArrayList<Item> getItems() {
        return items;
    }
    
    
}
