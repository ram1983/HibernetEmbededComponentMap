package com.app.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.model.Address;
import com.app.model.Employee;
import com.app.util.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		
		Transaction tx=null;
		
		try(Session ses=HibernateUtil.getSf().openSession()) {
			
			tx=ses.beginTransaction();
			Address add=new Address();
			add.setHono(444);
			add.setArea("Sadar");
			Employee emp= new Employee();
			emp.setEmpId(110);
			emp.setEmpname("Abhi");
			emp.setEmpSal(1270.00);
			emp.setAddr(add);
			
			ses.saveOrUpdate(emp);
			tx.commit();
		}catch(Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
		
	}
}
