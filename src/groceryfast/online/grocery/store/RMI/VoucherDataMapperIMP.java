/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groceryfast.online.grocery.store.RMI;

import com.mongodb.client.model.Filters;
import static groceryfast.online.grocery.store.RMI.DB.gson;
import org.bson.Document;

/**
 *
 * @author Ahmed Desouki
 */
public class VoucherDataMapperIMP implements VoucherDataMapper {
  DB db=new DB();
    @Override
    public void insertOne(Voucher voucher) {
         db.collectionVoucher.insertOne(Document.parse(gson.toJson(voucher)));
        System.out.println("voucher is inserted.");
    }

    @Override
    public void deleteOne(String VoucherID) {
          db.collectionVoucher.deleteOne(Filters.eq("voucherID", VoucherID));
         System.out.println("voucher is deleted.");
    }

    @Override
    public void updateOne(Voucher voucher) {
        
    }
    
}
