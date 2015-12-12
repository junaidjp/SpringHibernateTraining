package com.bank.dao;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


import org.hibernate.criterion.Restrictions;

import com.bank.entity.UserBean;


public class BankOfDanishDAO {
	
	
	
	
	public  static boolean  validateUser(String username,String password) { 

		Session session = null;
		
	try {
			SessionFactory sessionFactory = null;
			session = sessionFactory.openSession();
			Criteria criteria = session.createCriteria(UserBean.class);
			criteria.add(Restrictions.eq("username", username));
            criteria.add(Restrictions.eq("password", password));
            UserBean user = (UserBean) criteria.uniqueResult();
            session.flush();
            if(user != null)
            	return true;
       }

	catch(Exception ex) { 
		ex.printStackTrace();
	}
		return false;
		
	}
	
	
	
	
	
	
	
	
	public static void showAllCustomers() { 
	
		LoadAllCustomerWithAccounts loadAllCustomers = new LoadAllCustomerWithAccounts();
		loadAllCustomers.showAllCustomers();
	
	}
	
	

}
