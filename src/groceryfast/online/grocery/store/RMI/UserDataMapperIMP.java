/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groceryfast.online.grocery.store.RMI;

import com.mongodb.client.model.Filters;
import static com.mongodb.client.model.Filters.eq;
import static groceryfast.online.grocery.store.RMI.DB.gson;
import java.util.Optional;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author Ahmed Desouki
 */
public class UserDataMapperIMP implements UserDataMapper {
         DB db=new DB();
    @Override
    public Optional<User> find(int userID) {
             return null;
    }

    @Override
    public void insertSubscriber(Customer  customer) {
        db.collectionsubscribers.insertOne(Document.parse(gson.toJson(customer)));
        System.out.println("subscriber is inserted.");
    }

    @Override
    public void updateOne(Customer  customer) {
        
    }

    @Override
    
    //Delete fron subscribers 
    public void deleteSubscriber(String username) {
        //Bson query = eq("username", "Desoukii");
        db.collectionsubscribers.deleteOne(Filters.eq("username", username));
         System.out.println("subscriber is deleted.");
    }
    
}
