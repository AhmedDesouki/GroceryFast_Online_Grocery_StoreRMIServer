/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groceryfast.online.grocery.store.RMI;

/**
 *
 * @author Farid
 */
public class OrderPlaced extends OrderState {

    public OrderPlaced(Order o) {
        this.order = o;
    }
    
    @Override
    public void PlaceOrder(){
        order.setCurrentState(new PackagePrep(order));
        System.out.println("Order is being packaged & prepared.");
    };
    
    @Override
    public void CancelOrder(){
        order.setCurrentState(null);
        System.out.println("Order is cancelled.");
    };
    
    
}
