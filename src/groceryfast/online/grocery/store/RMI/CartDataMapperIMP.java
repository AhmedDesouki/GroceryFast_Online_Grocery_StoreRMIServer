/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package groceryfast.online.grocery.store.RMI;

import com.mongodb.client.model.Filters;
import static groceryfast.online.grocery.store.RMI.DB.gson;
import java.util.Optional;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author patri
 */
public class CartDataMapperIMP implements CartDataMapper {

    DB db = new DB();

    @Override
    public void insertCart(Cart cart) {
        System.out.println("wt: " + Document.parse(gson.toJson(cart)));
        db.collectionCart.insertOne(Document.parse(gson.toJson(cart)));
        System.out.println("Cart is inserted.");
    }

    @Override
    public void updateCart(Cart Cart) {

    }

    @Override
    public void deleteCart(Customer customer) {
        db.collectionCart.deleteOne(Document.parse(gson.toJson(customer)));
        System.out.println("Cart has Been Deleted For user" + customer.getEmail());

    }

}
