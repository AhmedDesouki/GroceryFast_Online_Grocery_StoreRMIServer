/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;


import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Ahmed Desouki
 */
public interface CustomerInterface extends Remote{
  public  void login() throws RemoteException ;
   public void register(String usern,String em,String pass,String addres)  throws RemoteException;
}
