/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groceryfast.online.grocery.store.RMI;

import static groceryfast.online.grocery.store.RMI.DB.gson;
import org.bson.Document;

/**
 *
 * @author Ahmed Desouki
 */
public class WarehouseDataMapperIMP implements WarehouseDataMapper{
  DB db=new DB();
    @Override
    public void insertOne(warehouse w) {
        db.collectionWarehouse.insertOne(Document.parse(gson.toJson(w)));
        System.out.println("warehouse is inserted.");
    }

    @Override
    public void deleteWarehouse(String username) {
    }
    
}
