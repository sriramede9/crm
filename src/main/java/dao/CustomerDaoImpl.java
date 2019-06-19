package dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import entity.Customer;

@Component("cimp")
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	HibernateTemplate hibernateTemplate;

	@Override
	@Transactional
	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		List<Customer> loadAll = hibernateTemplate.loadAll(Customer.class);
		return loadAll;
	}

	@Override
	@Transactional
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub

		// inital test

		System.out.println("here is our customer" + customer);

		hibernateTemplate.saveOrUpdate(customer);

	}

	@Override
	@Transactional
	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub

		hibernateTemplate.update(customer);
		System.out.println("customer is updated " + customer);

	}

	@Override
	@Transactional
	public Customer getCustomerbyId(int theid) {
		// TODO Auto-generated method stub

		Customer thecustomer = hibernateTemplate.get(Customer.class, theid);

		return thecustomer;
	}

	@Override
	@Transactional
	public void deleteCustomer(Customer customer) {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(customer);

		System.out.println(customer + "is deleted");
	}

}
