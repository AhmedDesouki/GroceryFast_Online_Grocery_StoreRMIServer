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
public abstract class OrderState {
    protected Order order;

    public abstract void PlaceOrder();
    public abstract void CancelOrder();
    
    
    
}
