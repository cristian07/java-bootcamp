package com.globant.cristian.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "teacher")
public class Teacher {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int teacher_id;
	@NotNull
	private String t_f_name;
	@NotNull
	private String t_l_name;

	public Teacher(int teacher_id) {
		this.teacher_id = teacher_id;
	}

	public Teacher() {
	}

	public Teacher(String t_f_name2, String t_l_name2) {
		// TODO Auto-generated constructor stub
	}

	public int getTeacher_id() {
		return teacher_id;
	}

	public void setTeacher_id(int teacher_id) {
		this.teacher_id = teacher_id;
	}

	public String getT_f_name() {
		return t_f_name;
	}

	public void setT_f_name(String t_f_name) {
		this.t_f_name = t_f_name;
	}

	public String getT_l_name() {
		return t_l_name;
	}

	public void setT_l_name(String t_l_name) {
		this.t_l_name = t_l_name;
	}

}
