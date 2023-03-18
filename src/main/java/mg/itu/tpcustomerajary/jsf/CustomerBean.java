/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mg.itu.tpcustomerajary.jsf;

import mg.itu.tpcustomerajary.entities.Customer;  
import jakarta.ejb.EJB;  
import jakarta.inject.Named;  
import jakarta.faces.view.ViewScoped;  
import java.io.Serializable;  
import java.util.List;  
import mg.itu.tpcustomerajary.ejb.CustomerManager;

/**
 *
 * @author ajari
 */
@Named(value = "customerBean")  
@ViewScoped  
public class CustomerBean implements Serializable {  
  private List<Customer> customerList;  

  @EJB
  private CustomerManager customerManager;  

  public CustomerBean() {  }  

  /** 
   * Retourne la liste des clients pour affichage dans une DataTable.     
   */  
  public List<Customer> getCustomers() {
    if (customerList == null) {
      customerList = customerManager.getAllCustomers();
    }
    return customerList;
  }  
}