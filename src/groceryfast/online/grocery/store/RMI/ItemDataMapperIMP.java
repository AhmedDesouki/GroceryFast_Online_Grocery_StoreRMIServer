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
public class ItemDataMapperIMP implements ItemDataMapper {
DB db=new DB();
    @Override
    public void insertItem(Item item) {
         db.collectionItems.insertOne(Document.parse(gson.toJson(item)));
        System.out.println("item is inserted.");
    }
    
}
