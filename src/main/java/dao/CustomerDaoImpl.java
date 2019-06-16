package dao;

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

}
