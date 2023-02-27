package com.HibernateAssignment1.DepartmentEmployeeManyToOne;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {
     @Id
     private int id;
     private String name;
     @OneToMany
     private List<Employee> employee;
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
	public List<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	public Department(int id, String name, List<Employee> employee) {
		super();
		this.id = id;
		this.name = name;
		this.employee = employee;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
     
}
