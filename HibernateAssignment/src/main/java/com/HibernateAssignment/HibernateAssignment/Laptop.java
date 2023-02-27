package com.HibernateAssignment.HibernateAssignment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Laptop {
	@Id
	@Column(name="Laptop_Id")
	private int id;
	
	private String name;
	@OneToOne
	@JoinColumn(name="S_name")
	private Student student;
	//getter setter method
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	//constructor
	public Laptop(int id, String name, Student student) {
		super();
		this.id = id;
		this.name = name;
		this.student = student;
	}
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
