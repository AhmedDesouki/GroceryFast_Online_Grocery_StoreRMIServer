/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groceryfast.online.grocery.store.RMI;

import groceryfast.online.grocery.store.RMI.StrategyPattern.PaymentService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import rmi.CustomerInterface;

/**
 *
 * @author Ahmed Desouki
 */
public class Customer extends UnicastRemoteObject implements CustomerInterface {

    private String username;
    private String email;
    private String password;
    private String address;
    private Cart cart;
    private PaymentService ps;

    public Customer() throws RemoteException {
        this.username = "";
        this.email = "";
        this.password = "";
        this.address = "";
        this.cart=null;
        this.ps=null;

    }

    public Customer(String username, String email, String password, String address, Cart cart, PaymentService ps) throws RemoteException {
        this.username = username;
        this.email = email;
        this.password = password;
        this.address = address;
        this.cart = cart;
        this.ps = ps;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

//    public void login() {
//        UserDataMapperIMP udm = new UserDataMapperIMP();
//        if (udm.find(this.getUsername()) != null) {
//            System.out.println("Login successful");
//        } else {
//            System.out.println("User doesn't exist");
//        }
//    }
    @Override
    public void login() throws RemoteException {
        UserDataMapperIMP udm = new UserDataMapperIMP();
        if (udm.find(this.getUsername()) != null) {
            System.out.println("Login successful");
        } else {
            System.out.println("User doesn't exist");
        }
    }

//       @Override
//    public void register() throws RemoteException {
//        UserDataMapperIMP udm = new UserDataMapperIMP();
//        udm.insertCustomer(this);
//    }
    @Override
    public void register(String usern, String em, String pass, String addres) throws RemoteException {
        UserDataMapperIMP udm = new UserDataMapperIMP();
        Customer c= new Customer(usern,em,pass,addres,null,null);
        udm.insertCustomer(c);
    }

    @Override
    public String toString() {
        return "Customer{" + "username=" + username + ", email=" + email + ", password=" + password + ", address=" + address + ", cart=" + cart + ", ps=" + ps + '}';
    }

}
