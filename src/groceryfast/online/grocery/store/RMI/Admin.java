package groceryfast.online.grocery.store.RMI;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ahmed Desouki
 */
public class Admin extends User{
    static Admin instance; 
    private String address;
     
    private Admin(){
        super("Admin",  "Admin@bue.com",  "1234");  
    }

    public static Admin getInstance(){
        if(instance == null)
        {
            instance = new Admin();
        }
            return instance;
    }

   
    public void login(){
        UserDataMapperIMP udm = new UserDataMapperIMP();
        if(udm.findAdmin(this.getUsername()) != null){
            System.out.println("Login successful");
        }
        else{
            System.out.println("User doesn't exist");
        }
    }
}
