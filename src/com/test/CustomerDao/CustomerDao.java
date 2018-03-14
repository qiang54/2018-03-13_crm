package com.test.CustomerDao;

import org.hibernate.Session;

import com.hibertest.domain.Customer;
import com.hibertest.uitls.HibernateUtils;

public class CustomerDao {

	public void save(Customer customer) {

		Session session = HibernateUtils.getCurrentSession();
		session.save(customer);
		
	}

}
