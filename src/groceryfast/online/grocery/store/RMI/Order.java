/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groceryfast.online.grocery.store.RMI;

import groceryfast.online.grocery.store.RMI.StrategyPattern.PaymentService;
import java.util.ArrayList;
import org.bson.Document;

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
    private Cart cart;

    //Constructor:
    public Order(int OrderID, float TotalPrice, String Date, Cart cart) {
        this.OrderID = OrderID;
        this.TotalPrice = TotalPrice;
        this.Date = Date;
        this.cart = cart;
    }

    //Methods:
    public void PlaceOrder() {
        double total = 0;
        ItemDataMapperIMP idm = new ItemDataMapperIMP();
        
        ArrayList<Document> orderItems = idm.findItemByCart(this.cart);
        
        System.out.println(orderItems.size());
        
        for(int i = 0; i < orderItems.size(); ++i){
            total += (double)orderItems.get(i).get("price");
        }
        System.out.println("wtf total: " + total);
        UserDataMapperIMP udm = new UserDataMapperIMP();
        Document d = udm.findCustomerByCart(this.cart);
        System.out.println("d: " + d);
        PaymentService ps = (PaymentService)d.get("ps");
        System.out.println("wtf ps: " + ps);
        
        if (this.CurrentState == null) {
            this.setCurrentState(new OrderPlaced(this));
            System.out.println("Order has been placed successfully.");
        } else {
            System.out.println("Order already placed.");

        }
    }

    public void CancelOrder(Order O) {

        System.out.println("Cannot cancel an order that hasn't been placed yet");

    }

    @Override
    public String toString() {
        return "Order{" + "OrderID=" + OrderID + ", TotalPrice=" + TotalPrice + ", Date=" + Date + ", CurrentState=" + CurrentState + ", cart=" + cart + '}';
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

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    
}
