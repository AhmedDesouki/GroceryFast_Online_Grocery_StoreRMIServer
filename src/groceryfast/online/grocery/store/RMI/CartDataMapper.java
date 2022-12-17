/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package groceryfast.online.grocery.store.RMI;

/**
 *
 * @author patri
 */
public interface CartDataMapper {
    
        void insertCart(Cart Cart);

        void updateCart(Cart Cart) ;

        void deleteCart(Customer cart);
}
