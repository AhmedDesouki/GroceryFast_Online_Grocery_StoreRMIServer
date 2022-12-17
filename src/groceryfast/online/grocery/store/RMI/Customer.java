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
public class Customer extends User{
    private String address;
    
    public Customer() {
        this.address = "";
    }

    public Customer(String username, String email, String password,String address) {
        super(username, email, password);
        this.address=address;
    }

   
    public void login(){
        UserDataMapperIMP udm = new UserDataMapperIMP();
        if(udm.find(this.getUsername()) != null){
            System.out.println("Login successful");
        }
        else{
            System.out.println("User doesn't exist");
        }
    }
    
    public void register(){
        UserDataMapperIMP udm = new UserDataMapperIMP();
        udm.insertCustomer(this);
    }
}
