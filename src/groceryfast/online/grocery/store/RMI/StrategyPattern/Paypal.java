/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package groceryfast.online.grocery.store.RMI.StrategyPattern;

/**
 *
 * @author patri
 */
public class Paypal implements PaymentStrategy {

    private String email;
    private String password;

    @Override
    public void collectPaymentDetails() {
        //Pop-Up to collect mail and passwords....

    }

    @Override
    public boolean validatePaymentDetails() {

        if (email.contains("@") & email.contains(".")) {
            return true;
        } else {
            return false;
        }
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public double pay(double amount
    ) {
        System.out.println("Paying " + amount + "Using Paypal");
        return amount;
    }

}
