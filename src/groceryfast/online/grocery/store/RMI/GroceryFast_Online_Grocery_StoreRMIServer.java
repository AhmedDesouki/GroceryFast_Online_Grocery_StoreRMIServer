/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groceryfast.online.grocery.store.RMI;

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
           
        DB db = new DB();
        Voucher v=new Voucher();
        Customer c=new Customer("Desoukii","alooo@gmail.com","password","cairo");
        Customer amro = new Customer("amro181","amro@gmail.com","password","cairo");
        Customer pat = new Customer("pat","pat@gmail.com","password","cairo");
        Voucher voucher=new Voucher("DFO123","12/10/2023");
       
        //amro.register();
        //pat.login();
        //amro.login();
//        db.insertUser(c);
          //v.addObserver(c);
         //v.removeObserver(c);
          //voucher.addVoucher(voucher);
          //voucher.removeVoucher(voucher);
          
         
          
        
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
//           System.out.println("Exception occured facade");
//        }   

    }
    
}
