/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package groceryfast.online.grocery.store.RMI;

import java.util.ArrayList;

/**
 *
 * @author patri
 */
public class Cart {

    private int size;

    public Cart(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void insetCart() {
        CartDataMapperIMP newCart = new CartDataMapperIMP();
        newCart.insertCart(this);
    }
}
