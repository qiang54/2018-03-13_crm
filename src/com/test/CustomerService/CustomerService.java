package com.test.CustomerService;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.hibertest.domain.Customer;
import com.hibertest.uitls.HibernateUtils;
import com.test.CustomerDao.CustomerDao;

public class CustomerService {

	public void save(Customer customer) {
		Session session = HibernateUtils.getCurrentSession();
		Transaction tr = session.beginTransaction();
		
		new CustomerDao().save(customer);
		tr.commit();
	}

	@Test
	public void run(){
		Customer c = new Customer();
		c.setCust_name("≤‚ ‘");
		this.save(c);
	}
}
