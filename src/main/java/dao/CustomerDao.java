package dao;

import java.util.List;

import entity.Customer;

public interface CustomerDao {

	List<Customer> getAll();

	int addCustomer(Customer customer);

	void updateCustomer(Customer customer);
}
