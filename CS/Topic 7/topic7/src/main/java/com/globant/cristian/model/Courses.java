package com.globant.cristian.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "courses")
public class Courses {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int courses_id;
	@NotNull
	private String c_name;

	public Courses(int courses_id) {
		this.courses_id = courses_id;
	}

	public Courses() {

	}

	public Courses(String c_name) {
	}

	public int getCourses_id() {
		return courses_id;
	}

	public void setCourses_id(int courses_id) {
		this.courses_id = courses_id;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

}
