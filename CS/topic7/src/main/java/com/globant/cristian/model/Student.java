package com.globant.cristian.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long student_id;
	@NotNull
	private String s_f_name;
	@NotNull
	private String s_l_name;

	public Student() {

	}

	public Student(long student_id) {
		this.student_id = student_id;
	}

	public Student(String s__name2, String s_l_name2) {
		this.s_f_name = s__name2;
		this.s_l_name = s_l_name2;
		
	}

	public long getStudent_id() {
		return student_id;
	}

	public void setStudent_id(long student_id) {
		this.student_id = student_id;
	}

	public String getS_f_name() {
		return s_f_name;
	}

	public void setS_f_name(String s_f_name) {
		this.s_f_name = s_f_name;
	}

	public String getS_l_name() {
		return s_l_name;
	}

	public void setS_l_name(String s_l_name) {
		this.s_l_name = s_l_name;

	}

}
