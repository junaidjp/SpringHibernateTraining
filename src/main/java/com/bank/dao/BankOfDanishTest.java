package com.bank.dao;

import java.sql.SQLException;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.bank.entity.UserBean;



public class BankOfDanishTest {
	
	
	public static void main(String args[]) {

		Session session = null;

		try {
	ApplicationContext daoContext = new ClassPathXmlApplicationContext("applicationcontext-orm.xml");
	
	 HibernateTemplate hibernateTemplate = (HibernateTemplate) daoContext.getBean("hibernateTemplate");
	 
	 UserBean userBean = findUserbyId(hibernateTemplate,1);
	 
	 System.out.println(userBean.getUsername());
	 }

		catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	@SuppressWarnings("unchecked")
	private static UserBean findUserbyId(HibernateTemplate hibernateTemplate,final int id) {
		
			HibernateCallback callback = new HibernateCallback() {
					   public Object doInHibernate(Session session)  {
					    return session.load(UserBean.class, id);
					   }
					  };
					return (UserBean) hibernateTemplate.execute(callback);
					
			
		
		
		
		
		
		
		
	}
}
	
