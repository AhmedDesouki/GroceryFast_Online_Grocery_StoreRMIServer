/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groceryfast.online.grocery.store.RMI;

import groceryfast.online.grocery.store.RMI.StrategyPattern.PaymentService;
import groceryfast.online.grocery.store.RMI.StrategyPattern.Visa;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import rmi.CustomerInterface;

/**
 *
 * @author Ahmed Desouki
 */
public class GroceryFast_Online_Grocery_StoreRMIServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws RemoteException, AlreadyBoundException {
        PaymentService paymentservice = new PaymentService();
        paymentservice.setStrategy(new Visa());
        paymentservice.processOrder();
        
        
        
         Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
        mongoLogger.setLevel(Level.SEVERE);

        DB db = new DB();
        
        
//        Cart c2 = new Cart(222);
//        c2.insetCart();
//
//        Customer c = new Customer("krem", "krem@gmail.com", "password", "cairo", c2, paymentservice);
//        UserDataMapperIMP udm = new UserDataMapperIMP();
//        udm.insertCustomer(c);
//
//        warehouse w = new warehouse(18, "zi-warehouse", "madenty", 4600);
//        WarehouseDataMapperIMP wdm = new WarehouseDataMapperIMP();
//        wdm.insertOne(w);
//
//        Item i1 = new Item(200, "meat1", "manga meat1", 200, w, c2, 20);
//        Item i2 = new Item(300, "bread1", "manga bread1", 300, w, c2, 40);
//        Item i3 = new Item(400, "drink1", "manga drink1", 400, w, c2, 50);
//        ItemDataMapperIMP idm = new ItemDataMapperIMP();
//        idm.insertItem(i1, w);
//        idm.insertItem(i2, w);
//        idm.insertItem(i3, w);
//
//        Order o = new Order(20, 30, "10-10-10", c.getCart());
//        o.PlaceOrder();

//        PaymentService paymentservice = new PaymentService();
//        paymentservice.setStrategy(new Visa());
//        paymentservice.processOrder();
//

//        User u = new User("test", "Ahmed@gmail.com", "password");
//        // db.insertUser(u);
////        
//        Voucher v = new Voucher();
//        Item i = new Item();
//        Customer c = new Customer("Desoukii", "alooo@gmail.com", "password", "cairo");
//        Voucher voucher = new Voucher("DFO123", "12/10/2023");
//
//        warehouse w = new warehouse(12, "zezo", "madenty", 300);
//        warehouse w2 = new warehouse(13, "mero", "masr el gdeda", 200);
//
//        Item item = new Item(33, "Pepsi", "drink", 10, w);
//        Item item2 = new Item(34, "cola", "drink", 15, w2);
//        Item item3 = new Item(35, "water", "drink", 5, w);
//        Item item4 = new Item(35, "ae 5ara", "deko", 100, w);
//          ArrayList<Item> items = new ArrayList<Item>();
//          items.add(item);
//          items.add(item2);
//          items.add(item3);
//       
        // w.addwarehouse(w2);
//        db.insertUser(c);
        //v.addObserver(c);
        //v.removeObserver(c);
        //voucher.addVoucher(voucher);
        //voucher.removeVoucher(voucher);
        //item.AddItem(item2,w);
        //item.AddItem(item3,w2);
        // item.AddItem(item4,w);
        //i.RemoveItem(item4);
        
        
        CustomerInterface si=new Customer();
        
         // An RMI Registry initialized on port 1099
        Registry r = LocateRegistry.createRegistry(1099);
        
        // Our remote object g is binded to the name "grade"
        r.bind("signup", si);
       
        
          System.out.println("The server is ready");
        
        
        
        
        
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
