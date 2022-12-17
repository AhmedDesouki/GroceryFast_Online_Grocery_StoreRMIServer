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
public class WarehouseManager extends User{

    public WarehouseManager() {
    }

    public WarehouseManager(String username, String email, String password) {
        super(username, email, password);
    }
    
    public void login(){
        UserDataMapperIMP udm = new UserDataMapperIMP();
        if(udm.findWarehouse(this.getUsername()) != null){
            System.out.println("Login successful");
        }
        else{
            System.out.println("User doesn't exist");
        }
    }
}
