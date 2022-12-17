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
    //private ArrayList<Item> listofitems = new ArrayList();

    public Item() {
    }

    public Item(int itemID, String itemname, String Description, int quantity) {
        this.itemID = itemID;
        this.itemname = itemname;
        this.Description = Description;
        this.quantity = quantity;
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

//    public void setListofitems(ArrayList<Item> listofitems) {
//        this.listofitems = listofitems;
//    }
    public void AddItem(Item T){
        //listofitems.add(T);
        ItemDataMapperIMP DataMapperItem=new ItemDataMapperIMP();
        DataMapperItem.insertItem(T);
        System.out.println("Item is added successfully");
    }
    public void RemoveItem(Item T1){
        //listofitems.remove(T1);
           System.out.println("Item is removed successfully");
    }
}
