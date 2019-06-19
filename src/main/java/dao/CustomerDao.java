package dao;

import java.util.List;

import entity.Customer;

public interface CustomerDao {

	List<Customer> getAll();

	int addCustomer(Customer customer);

	Customer getCustomerbyId(int theid);

	void updateCustomer(Customer customer);

}
