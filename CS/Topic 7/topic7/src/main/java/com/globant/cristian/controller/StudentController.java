package com.globant.cristian.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.globant.cristian.model.Student;
import com.globant.cristian.model.StudentDao;

@Controller
public class StudentController {

	@Autowired
	StudentDao studentDao;

	public StudentController(StudentDao _studentDao) {
		this.studentDao = studentDao;
	}

	public StudentController() {
	}

	@RequestMapping("/create")
	@ResponseBody
	public String create(String s_f_name, String s_l_name) {
		try {
			Student student = new Student(s_f_name, s_l_name);
			studentDao.save(student);
		} catch (Exception ex) {
			return "Error creating the user: " + ex.toString();
		}
		return "Student succesfully created!";
	}

	@RequestMapping("/delete")
	@ResponseBody
	public String delete(int student_id) {
		try {
			Student student = new Student(student_id);
			studentDao.delete(student);
		} catch (Exception ex) {
			return "Error deleting the Student:" + ex.toString();
		}
		return "Student succesfully deleted!";
	}

	@RequestMapping("/get-by-name")
	@ResponseBody
	public String getByName(String s_f_name) {
		String studentId;
		try {
			Student student = studentDao.findByName(s_f_name);
			studentId = String.valueOf(student.getStudent_id());
		} catch (Exception ex) {
			return "User not found";
		}
		return "The user id is: " + studentId;
	}

	@RequestMapping("/update")
	@ResponseBody
	public String updateUser(int student_id, String s_f_name, String s_l_name) {
		try {
			Student student = studentDao.findOne(student_id);
			student.setS_f_name(s_f_name);
			student.setS_l_name(s_l_name);
			studentDao.save(student);
		} catch (Exception ex) {
			return "Error updating the user: " + ex.toString();
		}
		return "User succesfully updated!";
	}
}
	
	/*  @RequestMapping("/get")
	 @ResponseBody
	 Iterable<Student> allStudent(){ 
	 return
	 studentDao.findAll(); }
	 */
	//@RestController
	//@EnableAutoConfiguration
	// @ComponentScan
	//@Component("studentDao")

