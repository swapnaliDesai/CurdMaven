package com.scp.maven.CurdMaven;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

public class ManyToManyDemo {
	public static void main(String[] args) {
		
	}

}
@Entity
@Table(name="laptop_info")
class Laptop{
	@Id
	private int lid;
	private String lapyName;
	@OneToMany
	private List<Vendor> vendor;
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", lapyName=" + lapyName + ", vendor=" + vendor + "]";
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLapyName() {
		return lapyName;
	}
	public void setLapyName(String lapyName) {
		this.lapyName = lapyName;
	}
	public List<Vendor> getVendor() {
		return vendor;
	}
	public void setVendor(List<Vendor> vendor) {
		this.vendor = vendor;
	}
	public Laptop(int lid, String lapyName, List<Vendor> vendor) {
		super();
		this.lid = lid;
		this.lapyName = lapyName;
		this.vendor = vendor;
	}
	public Laptop() {
		super();
	}
	
	
}

@Entity
@Table(name="Vendor_info")
class Vendor{
	@Id
	private int vid;
	private String vendorName;
	@OneToMany
	private Laptop laptop;
	@Override
	public String toString() {
		return "Vendor [vid=" + vid + ", vendorName=" + vendorName + ", laptop=" + laptop + "]";
	}
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public Vendor(int vid, String vendorName, Laptop laptop) {
		super();
		this.vid = vid;
		this.vendorName = vendorName;
		this.laptop = laptop;
	}
	public Vendor() {
		super();
	}
	
	
}