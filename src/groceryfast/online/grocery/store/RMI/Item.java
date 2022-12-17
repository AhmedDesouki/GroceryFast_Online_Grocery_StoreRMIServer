/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groceryfast.online.grocery.store.RMI;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Item {

    private int itemID;
    private String itemname;
    private String Description;
    private int quantity;
    private warehouse warehousee;
    private double price; 
    private Cart cart;
    //private ArrayList<Item> listofitems = new ArrayList();


    public Item(int itemID, String itemname, String Description, int quantity, warehouse warehousee, Cart cart, double price) {
        this.itemID = itemID;
        this.itemname = itemname;
        this.Description = Description;
        this.quantity = quantity;
        this.warehousee = warehousee;
        this.cart = cart;
        this.price = price;
    }

    public int getItemID() {
        return itemID;
    }

    public String getItemname() {
        return itemname;
    }

    public String getDescription() {
        return Description;
    }

    public int getQuantity() {
        return quantity;
    }

//    public ArrayList<Item> getListofitems() {
//        return listofitems;
//    }
    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public warehouse getWarehousee() {
        return warehousee;
    }

    public void setWarehousee(warehouse warehousee) {
        this.warehousee = warehousee;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
    
//    public void setListofitems(ArrayList<Item> listofitems) {
//        this.listofitems = listofitems;
//    }
    public void AddItem(Item T, warehouse w) {
        //listofitems.add(T);
        ItemDataMapperIMP DataMapperItem = new ItemDataMapperIMP();

        DataMapperItem.insertItem(T, w);
        System.out.println("Item is added successfully");
    }

    public void RemoveItem(Item T1) {

        ItemDataMapperIMP DataMapperItem = new ItemDataMapperIMP();
        DataMapperItem.deleteItem(T1.getItemID());
        System.out.println("Item is removed successfully");

    }
}
