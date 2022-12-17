/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groceryfast.online.grocery.store.RMI;

import groceryfast.online.grocery.store.RMI.StrategyPattern.PaymentService;
import groceryfast.online.grocery.store.RMI.StrategyPattern.Visa;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author Ahmed Desouki
 */
public class GroceryFast_Online_Grocery_StoreRMIServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
           PaymentService paymentservice = new PaymentService();
           paymentservice.setStrategy(new Visa());
           paymentservice.processOrder();
        
        DB db = new DB();
         User u=new User("test","Ahmed@gmail.com","password");
        db.insertUser(u);
//        
//         try {
//            // My remote object [Skeleton]
//            FacadeInterface facade = new UserFacade();
//            
//            // My RMI Registry
//            Registry registry = LocateRegistry.createRegistry(1099);
//            
//            //Add my object to the RMI Registry
//            registry.bind("fff", facade);
//            System.out.println("My facade is ready...");   
//        } catch (Exception ex) {
//           System.out.println("Exception occured here ");
//        }   
//    }
    
}}
