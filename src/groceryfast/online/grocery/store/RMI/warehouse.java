/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class warehouse {
    private int warehouseID;
    private String Warehousename;
    private String Location;
    private int itemcapacity;
    //private ArrayList <Item> listofitems = new ArrayList();

    public warehouse() {
    }

    public warehouse(int warehouseID, String Warehousename, String Location, int itemcapacity) {
        this.warehouseID = warehouseID;
        this.Warehousename = Warehousename;
        this.Location = Location;
        this.itemcapacity = itemcapacity;
       // this.listofitems=listofitems;
        
    }



    warehouse(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
    

    public void setWarehouseID(int warehouseID) {
        this.warehouseID = warehouseID;
    }

    public void setWarehousename(String Warehousename) {
        this.Warehousename = Warehousename;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public void setItemcapacity(int itemcapacity) {
        this.itemcapacity = itemcapacity;
    }

//    public void setListofitems(ArrayList<Item> listofitems) {
//        this.listofitems = listofitems;
//    }

    public int getWarehouseID() {
        return warehouseID;
    }

    public String getWarehousename() {
        return Warehousename;
    }

    public String getLocation() {
        return Location;
    }

    public int getItemcapacity() {
        return itemcapacity;
    }

//    public ArrayList<Item> getListofitems() {
//        return listofitems;
//    }
    
    public void addwarehouse(warehouse w){
       WarehouseDataMapperIMP DataMapperWarehouse=new WarehouseDataMapperIMP();
        DataMapperWarehouse.insertOne(w);
        System.out.println("warehouse is added successfully");
    }
    
}

