/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groceryfast.online.grocery.store.RMI;

import com.mongodb.client.model.Filters;
import static com.mongodb.client.model.Filters.eq;
import static groceryfast.online.grocery.store.RMI.DB.gson;
import java.util.ArrayList;
import org.bson.Document;

/**
 *
 * @author Ahmed Desouki
 */
public class ItemDataMapperIMP implements ItemDataMapper {

    DB db = new DB();

    @Override
    public void insertItem(Item item, warehouse w) {
        db.collectionItems.insertOne(Document.parse(gson.toJson(item)));
        System.out.println("item is inserted.");
    }

    @Override
    public void deleteItem(int itemID) {
        db.collectionItems.deleteOne(Filters.eq("itemID", itemID));
        System.out.println("item is deleted.");
    }

    @Override
    public ArrayList<Document> findItemByCart(Cart cart) {
        ArrayList<Document> d = new ArrayList<Document>();
        System.out.println("wat: " + db.collectionItems.find(eq("cart", cart)));
        return d;
    }
}
