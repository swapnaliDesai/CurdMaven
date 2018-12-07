package com.scp.maven.CurdMaven;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.scp.util.AppUtil;

public interface CustService {
	public boolean addCustmor(Custmor cid);
	public boolean deletCustmor(Custmor cid);
	public Custmor getCustmor(int id);
    public Custmor updateCustmor(Custmor cid);
    public List<Custmor> getAllCustmor();
}



class CustImpl implements CustService{
	private static SessionFactory sf=null;
	static {
		sf=AppUtil.getSessionFactory();
		
	}

	public boolean addCustmor(Custmor cid) {
		try {
			Session se=sf.openSession();
			Transaction tr=se.beginTransaction();
			se.save(cid);
			
			AppUtil.closeResourses(se, tr);
		}
		catch(Exception e) {
		return false;
		
			
		}
		return true;
	}

	public boolean deletCustmor(Custmor cid) {
		try{
			
			Session se=sf.openSession();
			Transaction tr=se.beginTransaction();
			se.delete(cid);
			
		AppUtil.closeResourses(se, tr);
		}
		catch(Exception e) {
		return false;
	}
		return true;

}
/*	public static void util(Custmor cid) {
           Session se=sf.openSession();
			Transaction tr=se.beginTransaction();
		   if(cid!=null)
			se.delete(cid);
		   else
			   se.save(cid);
		AppUtil.closeResourses(se, tr);
		
		
	}
*/

	public Custmor getCustmor(int cid) {
		try{
			Session se=sf.openSession();
		Custmor cust=se.get(Custmor.class, cid);
		Transaction tr=se.beginTransaction();
		
		
	AppUtil.closeResourses(se, tr);
	
		return cust;
		}
		catch(Exception e) {
			return null;
			
		}
	}

public Custmor updateCustmor(Custmor cid) {
	try {
		Custmor dbcust=getCustmor(cid.getId());
		if(dbcust!=null) {
			Session se=sf.openSession();
			Transaction tr=se.beginTransaction();
			Custmor updateCust=(Custmor) se.merge(cid);
			AppUtil.closeResourses(se, tr);
			return updateCust;

			}
		System.out.println("no custmor exist with given id so can not update");
	}
	catch(Exception e) {
		
	
	
}
	return null;
}
public List<Custmor> getAllCustmor() {
	Session se=AppUtil.getSessionFactory().openSession();
	Transaction tr=se.beginTransaction();
	List<Custmor>custlist=se.createCriteria(Custmor.class).list();
	AppUtil.closeResourses(se, null);
	System.out.println(custlist);
	return custlist;
}
	}