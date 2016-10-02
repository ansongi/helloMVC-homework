package service;

import java.util.HashMap;
import java.util.Map;

import model.Customer;

public class CustomerService {

	private Map<String, Customer> customers;
	
	private static final CustomerService instance = new CustomerService();
	private CustomerService(){
		customers = new HashMap<String, Customer>();
	}
	public static CustomerService getInstance(){
		return instance;
	}
	
	public void addCustomer(Customer customer){
		customers.put(customer.getId(), customer);
	}
	
	public Customer login(String id, String password) {
		//home work 맵에 존재하는지 체크
		if((customers.get("id")).getId() == id && (customers.get("password")).getPassword()== password) 
			return(customers.get(id.toLowerCase()));
		else 
		return null;
	}
	
	public Customer findCustomer(String id){
		
		if(id != null) 
			return (customers.get(id.toLowerCase()));
		else
			return null;
	}
	
}
