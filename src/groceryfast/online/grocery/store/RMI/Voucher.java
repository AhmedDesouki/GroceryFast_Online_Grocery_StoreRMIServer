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
public class Voucher implements Subject {
   private String voucherID;
   private String expiry;
   
  
   
    public Voucher(String voucherID, String expiry) {
        this.voucherID = voucherID;
        this.expiry = expiry;
    }
    
    public Voucher() {
        
    }

    public String getVoucherID() {
        return voucherID;
    }

    public void setVoucherID(String voucherID) {
        this.voucherID = voucherID;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }
    
    
    public void addVoucher(Voucher voucher){
         VoucherDataMapperIMP DataMapperVoucher=new VoucherDataMapperIMP();
        DataMapperVoucher.insertOne(voucher);
    }
    
     public void removeVoucher(Voucher voucher){
          VoucherDataMapperIMP DataMapperVoucher=new VoucherDataMapperIMP();
        DataMapperVoucher.deleteOne(voucher.getVoucherID());
    }
    
    

    @Override
    public void addObserver(Customer  customer) {
        UserDataMapperIMP DataMapper=new UserDataMapperIMP();
        DataMapper.insertSubscriber(customer);
    }

    @Override
    public void removeObserver(Customer  customer) {
        UserDataMapperIMP DataMapper=new UserDataMapperIMP();
       DataMapper.deleteSubscriber(customer.getUsername());
    }

    @Override
    public void notifyy() {
    }

    
    
    
    
}
