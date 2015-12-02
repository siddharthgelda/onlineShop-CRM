package com;

import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.xml.ws.Response;

import org.hibernate.HibernateException;
import org.hibernate.ReplicationMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class StateManage {
	/* Method to CREATE an employee in the database */
	public Integer addState(String StateName) {
		SessionFactory sessionFactory = hibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		Integer Id = null;
		try {
			tx = session.beginTransaction();
			//State state = new State(StateName);
			Set<City> cities = new HashSet<City>();
			//cities.add(new City("ahmadabad"));
			//cities.add(new City("surat"));
			//cities.add(new City("gaandhinagar"));
			//state.setCities(cities);
			//Id = (Integer) session.save(state);

			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();

		}
		return Id;
	}

	/* Method to READ only those banks which have branches */
	public List<State> listCities() {
		SessionFactory sessionFactory = hibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();

//			List<Object[]> results = session
//					.createQuery(
//							"select State.StateName as stName, ct.cityName as ctName from State as state INNER JOIN state.cities as ct")
//					.list();
//			System.out.println(results.size());
//			for (Object[] o : results) {
//				System.out.println(o);
//				for (Object a : o) {
//					System.out.println(a);
//				}
			//}
			List<State> list = session.createQuery("From State").list();
	return list;
			
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
			return null;
		} finally {
			//tx.commit();
			//session.close();

		}
	}

	

	public static void main(String[] args) {
		//sessionTestData();
		StateManage mb=new StateManage();
		//mb.addState("gujrat");
		List<State> states=mb.listCities();
		//Iterator<State> it=states.iterator();
		
		for(State s:states){
			for(City c:s.getCities()){
				System.out.println(c.getCityName());
				//System.out.println(c.getId());
				
			}
			//System.out.println(s.getId());
		}
		
	}
}
