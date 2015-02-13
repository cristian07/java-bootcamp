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

import com.globant.cristian.model.Courses;
import com.globant.cristian.model.CoursesDao;
import com.globant.cristian.model.Student;
import com.globant.cristian.model.StudentDao;
import com.globant.cristian.model.Teacher;
import com.globant.cristian.model.TeacherDao;

@Controller
public class ProyectController {

	@Autowired
	StudentDao studentDao;

	@Autowired
	CoursesDao coursesDao;

	@Autowired
	TeacherDao teacherDao;

	
	public ProyectController() {
	}

	@RequestMapping("/createStudent")
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

	@RequestMapping("/deleteStudent")
	@ResponseBody
	public String deleteStudent(int student_id) {
		try {
			Student student = new Student(student_id);
			studentDao.delete(student);
		} catch (Exception ex) {
			return "Error deleting the Student:" + ex.toString();
		}
		return "Student succesfully deleted!";
	}

	@RequestMapping("/get-by-nameStudent")
	@ResponseBody
	public String getStudentByName(String s_f_name) {
		String studentId;
		try {
			Student student = studentDao.findByName(s_f_name);
			studentId = String.valueOf(student.getStudent_id());
		} catch (Exception ex) {
			return "User not found";
		}
		return "The user id is: " + studentId;
	}

	@RequestMapping("/updateStudent")
	@ResponseBody
	public String updateStudent(int student_id, String s_f_name, String s_l_name) {
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

	@RequestMapping("/createCourses")
	@ResponseBody
	public String createCourses(String c_name) {
		try {
			Courses courses = new Courses(c_name);
			coursesDao.save(courses);
		} catch (Exception ex) {
			return "Error creating the user: " + ex.toString();
		}
		return "Student succesfully created!";
	}

	@RequestMapping("/get-by-nameCourses")
	@ResponseBody
	public String getCoursesByName(String c_name) {
		String coursesId;
		try {
			Courses courses = coursesDao.findByName(c_name);
			coursesId = String.valueOf(courses.getCourses_id());
		} catch (Exception ex) {
			return "User not found";
		}
		return "The user id is: " + coursesId;
	}

	@RequestMapping("/createTeacher")
	@ResponseBody
	public String createTeacher(String t_f_name, String t_l_name) {
		try {
			Teacher teacher = new Teacher(t_f_name, t_l_name);
			teacherDao.save(teacher);
		} catch (Exception ex) {
			return "Error creating the user: " + ex.toString();
		}
		return "Student succesfully created!";
	}
}
