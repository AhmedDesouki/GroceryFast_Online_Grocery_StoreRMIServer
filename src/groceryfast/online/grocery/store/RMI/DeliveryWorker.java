/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groceryfast.online.grocery.store.RMI;

/**
 *
 * @author Ahmed Desouki
 */
public class DeliveryWorker extends User{

    public DeliveryWorker() {
    }

    public DeliveryWorker(String username, String email, String password) {
        super(username, email, password);
    }
    public void login(){
        UserDataMapperIMP udm = new UserDataMapperIMP();
        if(udm.findDelivery(this.getUsername()) != null){
            System.out.println("Login successful");
        }
        else{
            System.out.println("User doesn't exist");
        }
    }
}
