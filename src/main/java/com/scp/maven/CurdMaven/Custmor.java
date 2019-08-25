package com.scp.maven.CurdMaven;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;

@Entity
@Table(name="cust_hb")
public class Custmor {
	@Id
	@Column(name="cist_id")
	private int id;
	private int age;
	private int salary;
	@Override
	public String toString() {
		return "\n Custmor [id=" + id + ", age=" + age + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Custmor(int id, int age) {
		super();
		this.id = id;
		this.age = age;
	}
	public Custmor() {
		super();
	}
	
	

}
