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
public class PackagePrep extends OrderState{
    
    public PackagePrep(Order O) {
        this.order = O;
    }
    @Override
    public void PlaceOrder(){
        order.setCurrentState(new OutForDelivery(order));
        System.out.println("Order is on its way.");
    };
    
    @Override
    public void CancelOrder(){
        System.out.println("Unfortunately, you cannot cancel this order as it is already being prepared.");
    };
}
