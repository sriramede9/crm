package dao;

import java.util.List;

import entity.Customer;

public interface CustomerDao {

	List<Customer> getAll();

	void addCustomer(Customer customer);

	Customer getCustomerbyId(int theid);

	void updateCustomer(Customer customer);

	void deleteCustomer(Customer customer);

}
