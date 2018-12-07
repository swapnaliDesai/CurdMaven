package com.scp.maven.CurdMaven;

import java.util.List;

import org.hibernate.Session;

import com.scp.util.AppUtil;

public class TestMavn {
	public static void main(String[] args) {
		
		Custmor c1= new Custmor(1, 20);
		Custmor c3=new Custmor(3, 25);
		
		CustImpl ci=new CustImpl();
		System.out.println("--cust added---");
		boolean iscustAdded=ci.addCustmor(c1);
	   String yesorNo=iscustAdded?"Yes":"No";
	   ci.addCustmor(c3);
	
		System.out.println("is cust added"+yesorNo);
	/*	
		boolean isdelete=ci.deletCustmor(c3);
		String YesorNo=isdelete?"Yes":"No";
		ci.deletCustmor(c3);
		System.out.println("is cust deleted"+YesorNo);
		
	*/	

		System.out.println("---get Custmor---");
		Custmor  dbcust=ci.getCustmor(1);
		System.out.println("get cust is"+dbcust);
		
		System.out.println("---update---");
		dbcust.setAge(58);
		Custmor updateCust=ci.updateCustmor(dbcust);
		System.out.println("updated-- "+dbcust);
		dbcust=ci.getCustmor(3);
		System.out.println("update--:"+dbcust);
		
	System.out.println("---getall--");	
	ci.getAllCustmor();
}

}
