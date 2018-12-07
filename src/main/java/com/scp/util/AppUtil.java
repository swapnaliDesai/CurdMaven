 package com.scp.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppUtil {
	private static SessionFactory sf=null;
	public static SessionFactory getSessionFactory() {
		if(sf==null) {
			Configuration con=new Configuration();
			sf=con.configure("custmor.cfg.xml").buildSessionFactory();
			
		}
		return sf;
		
	}
	public static void closeResourses(Session se,Transaction tr) {
		if(se!=null)
			se.flush();
		if(tr!=null)
			tr.commit();
		se.close();
		
	}
	

}
