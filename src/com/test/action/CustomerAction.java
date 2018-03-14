package com.test.action;
import com.hibertest.domain.Customer;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.test.CustomerService.CustomerService;

public class CustomerAction extends ActionSupport implements ModelDriven<Customer>{

	private static final long serialVersionUID = 1L;
	private Customer customer = new Customer();
	
	@Override
	public Customer getModel() {
		return customer;
	}
	
	
	public String save()  {
		 new CustomerService().save(customer);
		 return NONE;
	} 

}
