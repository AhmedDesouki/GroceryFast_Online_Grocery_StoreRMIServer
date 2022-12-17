/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groceryfast.online.grocery.store.RMI;

import java.util.Optional;
import org.bson.Document;

/**
 *
 * @author Ahmed Desouki
 */

public interface UserDataMapper {
    public Document find(String username);
    
    public Document findAdmin(String username);
    
    public Document findDelivery(String username);
    
    public Document findWarehouse(String username);
    
    void insertSubscriber(Customer customer);

    void updateOne(Customer  customer) ;

    void deleteSubscriber(String username);
    
    void insertCustomer(Customer customer);
}
