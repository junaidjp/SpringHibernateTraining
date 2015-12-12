package com.bank.dao;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.bank.entity.Account;
import com.bank.entity.Address;
import com.bank.entity.Bank;
import com.bank.entity.Customer;


public class LoadAllCustomerWithAccounts {

	public void showAllCustomers()
	{

		Session session = null;
		try {
			SessionFactory sessionFactory = null;
					
			session = sessionFactory.openSession();
			Query result = session.createQuery("from Customer");
			List<Customer> customerList = result.list();
			for (Customer customer : customerList) {
				
				System.out.println("                                                       ");
				System.out.println("Id  : " + customer.getCustomerId());
				System.out.println("Name :  " + customer.getName());
				System.out.println("Phone : " + customer.getPhone());
				System.out.println("Ssn :  "  + customer.getSsn());
				
				System.out.println("                                                       ");
				
				
				Address address = customer.getAddress();
				System.out.println("                                                       ");
				
				System.out.println("*************PRINT ADDRESS**************");
				
				System.out.println("                                                       ");
				
				System.out.println(customer.getName() + " Lives in  "
						+ address.getCity());

				System.out.println("                                                       ");
				
				List<Account> accounts = customer.getAccounts();
				
				System.out.println("****************Account Info Starting ********************");
				System.out.println("                                                       ");
				
				for (Account account : accounts) {
					
					if(account != null) {  // Check if the Account is Null / Hibernate Defect 
					System.out.println("****************Printing Account Info ********************");
					System.out.println("                                                       ");
					System.out.println(customer.getName() + " Has "
							+ account.getAccountType() + " Account");
					System.out.println("                                                       ");
					System.out.println(customer.getName() + " Has "
							+ account.getBalance() + "  in this Account");
					System.out.println("                                                       ");
					
					
					}

				}
				
				System.out.println("****************End Printing Account Info ********************");

			}
		}

		catch (Exception ex) {
			ex.printStackTrace();
		}

	}
}
