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
    //private ArrayList<Item> listofitems = new ArrayList();

    public Item() {
    }

    public Item(int itemID, String itemname, String Description, int quantity,warehouse warehousee) {
        this.itemID = itemID;
        this.itemname = itemname;
        this.Description = Description;
        this.quantity = quantity;
        this.warehousee=warehousee;
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
    public void AddItem(Item T,warehouse w){
        //listofitems.add(T);
        ItemDataMapperIMP DataMapperItem=new ItemDataMapperIMP();
         
        DataMapperItem.insertItem(T,w);
        System.out.println("Item is added successfully");
    }
    public void RemoveItem(Item T1){
      
           ItemDataMapperIMP DataMapperItem=new ItemDataMapperIMP();
           DataMapperItem.deleteItem(T1.getItemID());
           System.out.println("Item is removed successfully");
          
    }
}
