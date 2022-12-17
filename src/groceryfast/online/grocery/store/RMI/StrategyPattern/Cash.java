/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package groceryfast.online.grocery.store.RMI.StrategyPattern;

/**
 *
 * @author patri
 */
public class Cash implements PaymentStrategy{

    @Override
    public void collectPaymentDetails() {
       // Show Countine in GUI
    }

    @Override
    public boolean validatePaymentDetails() {
    return true;
    }

    @Override
    public double pay(double amount) {
        return amount;
    }
    
}
