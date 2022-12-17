/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package groceryfast.online.grocery.store.RMI.StrategyPattern;

/**
 *
 * @author patri
 */
public interface PaymentStrategy {

    void collectPaymentDetails();

    boolean validatePaymentDetails();

    double pay(double amount);
}
