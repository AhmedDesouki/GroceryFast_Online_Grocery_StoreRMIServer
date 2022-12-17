/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groceryfast.online.grocery.store.RMI;

import com.mongodb.client.FindIterable;
import com.mongodb.client.model.Filters;
import static com.mongodb.client.model.Filters.eq;
import static groceryfast.online.grocery.store.RMI.DB.gson;
import java.util.Iterator;
import java.util.Optional;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author Ahmed Desouki
 */
public class UserDataMapperIMP implements UserDataMapper {

    DB db = new DB();

    @Override
    public Document findCustomerByCart(Cart cart) {
        FindIterable<Document> iterDoc = db.collectionCustomer.find();
        Document d;
        Iterator it = iterDoc.iterator();
        while (it.hasNext()) {
            d = (Document) it.next();
            break;
        }
        return d;
    }

    @Override
    public Document find(String username) {
        Document d = db.collectionCustomer.find(eq("username", username)).first();
        return d;
    }

    @Override
    public Document findAdmin(String username) {
        Document d = db.collectionAdmin.find(eq("username", username)).first();
        return d;
    }

    @Override
    public Document findDelivery(String username) {
        Document d = db.collectionDeliveryWorker.find(eq("username", username)).first();
        return d;
    }

    @Override
    public Document findWarehouse(String username) {
        Document d = db.collectionWarehouseManager.find(eq("username", username)).first();
        return d;
    }

    @Override
    public void insertSubscriber(Customer customer) {
        db.collectionsubscribers.insertOne(Document.parse(gson.toJson(customer)));
        System.out.println("subscriber is inserted.");
    }

    @Override
    public void updateOne(Customer customer) {

    }

    @Override
    //Delete fron subscribers 
    public void deleteSubscriber(String username) {
        //Bson query = eq("username", "Desoukii");
        db.collectionsubscribers.deleteOne(Filters.eq("username", username));
        System.out.println("subscriber is deleted.");
    }

    @Override
    public void insertCustomer(Customer customer) {
        db.collectionCustomer.insertOne(Document.parse(gson.toJson(customer)));
        System.out.println("customer is inserted.");
    }

}
