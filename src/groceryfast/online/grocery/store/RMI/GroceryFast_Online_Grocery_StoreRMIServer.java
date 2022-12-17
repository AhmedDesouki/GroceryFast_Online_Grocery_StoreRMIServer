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
import java.util.ArrayList;

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
       // db.insertUser(u);
//        
        Voucher v=new Voucher();
         Customer c=new Customer("Desoukii","alooo@gmail.com","password","cairo");
         Voucher voucher=new Voucher("DFO123","12/10/2023");
         Item item=new Item(33,"Pepsi","drink",10);
         Item item2=new Item(34,"cola","drink",15);
          Item item3=new Item(35,"water","drink",5);
          ArrayList<Item> items = new ArrayList<Item>();
          items.add(item);
          items.add(item2);
          items.add(item3);
         warehouse w=new warehouse(12,"zezo","madenty",300,items);
         w.addwarehouse(w);
         
//        db.insertUser(c);
          //v.addObserver(c);
         //v.removeObserver(c);
          //voucher.addVoucher(voucher);
          //voucher.removeVoucher(voucher);
         //item.AddItem(item2);
          //item.AddItem(item3);
         
          
        
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
//           System.out.println("Exception occured facade");
//        }   
    }
    
}