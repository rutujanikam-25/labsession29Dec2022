package com.CourseHibernate.Course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Course {
	@Id
	private int id;
	private String name;
	//@OneToOne
	//private Student student;
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
	/*public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	*/
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int id, String name, Student student) {
		super();
		this.id = id;
		this.name = name;
		//this.student = student;
	}
	

}
