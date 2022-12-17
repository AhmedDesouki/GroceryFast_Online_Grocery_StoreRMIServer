/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package groceryfast.online.grocery.store.RMI.StrategyPattern;

import java.io.Serializable;

/**
 *
 * @author patri
 */
public class PaymentService implements Serializable  {
    private double cost;
    private PaymentStrategy strategy;
    private boolean includeService;
    private double serviceFees;
    // CustomerID will be added into the database 
    private int CustomerID;
    
    public void processOrder()
    {
        strategy.collectPaymentDetails();
       if(strategy.validatePaymentDetails())
       {
           strategy.pay(getTotal());
       }
    }

    public double getCost() {
        return cost;
    }

    public PaymentStrategy getStrategy() {
        return strategy;
    }

    public boolean isIncludeService() {
        return includeService;
    }

    public double getServiceFees() {
        return serviceFees;
    }

    public int getCustomerID() {
        return CustomerID;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void setIncludeService(boolean includeService) {
        this.includeService = includeService;
    }

    public void setServiceFees(double serviceFees) {
        this.serviceFees = serviceFees;
    }

    public void setCustomerID(int CustomerID) {
        this.CustomerID = CustomerID;
    }
    private double getTotal()
    {
        return includeService ? cost+serviceFees :cost ;
    }
    
}

