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
public interface VoucherDataMapper {
    
    void insertOne(Voucher voucher);
    
     void deleteOne(String VoucherID);
     
      void updateOne(Voucher voucher) ;
}
