/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groceryfast.online.grocery.store.RMI;

import groceryfast.online.grocery.store.RMI.StrategyPattern.PaymentService;

/**
 *
 * @author Ahmed Desouki
 */
public class Customer extends User {
    private String address;
    private Cart cart;
    private PaymentService ps;
    
    public Customer() {
        this.address = "";
    }

    public Customer(String username, String email, String password, String address, Cart cart, PaymentService ps) {
        super(username, email, password);
        this.address = address;
        this.cart = cart;
        this.ps = ps;
    }

    public void login() {
        UserDataMapperIMP udm = new UserDataMapperIMP();
        if (udm.find(this.getUsername()) != null) {
            System.out.println("Login successful");
        } else {
            System.out.println("User doesn't exist");
        }
    }

    public void register() {
        UserDataMapperIMP udm = new UserDataMapperIMP();
        udm.insertCustomer(this);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public PaymentService getPs() {
        return ps;
    }

    public void setPs(PaymentService ps) {
        this.ps = ps;
    }

    @Override
    public String toString() {
        return "Customer{" + "address=" + address + ", cart=" + cart + ", ps=" + ps + '}';
    }
    
    
}
