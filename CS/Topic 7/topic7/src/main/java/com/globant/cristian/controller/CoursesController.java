package com.globant.cristian.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.globant.cristian.model.Courses;
import com.globant.cristian.model.CoursesDao;
import com.globant.cristian.model.Student;
import com.globant.cristian.model.StudentDao;


@Controller
public class CoursesController {
	
		@Autowired
		CoursesDao coursesDao;

		public CoursesController(CoursesDao coursesDao) {
			this.coursesDao = coursesDao;
		}

		public CoursesController() {
		}

		@RequestMapping("/create")
		@ResponseBody
		public String create(String c_name) {
			try {
				Courses courses = new Courses(c_name);
				coursesDao.save(courses);
			} catch (Exception ex) {
				return "Error creating the user: " + ex.toString();
			}
			return "Student succesfully created!";
		}

		@RequestMapping("/delete")
		@ResponseBody
		public String delete(int courses_id) {
			try {
				Courses courses = new Courses(courses_id);
				coursesDao.delete(courses);
			} catch (Exception ex) {
				return "Error deleting the Student:" + ex.toString();
			}
			return "Student succesfully deleted!";
		}

		@RequestMapping("/get-by-name")
		@ResponseBody
		public String getByName(String c_name) {
			String coursesId;
			try {
				Courses courses = coursesDao.findByName(c_name);
				coursesId = String.valueOf(courses.getCourses_id());
			} catch (Exception ex) {
				return "User not found";
			}
			return "The user id is: " + coursesId;
		}

		@RequestMapping("/update")
		@ResponseBody
		public String updateUser(int courses_id, String s_f_name, String s_l_name) {
			try {
				Courses courses = coursesDao.findOne(courses_id);
				courses.setC_name(s_f_name);
				coursesDao.save(courses);
			} catch (Exception ex) {
				return "Error updating the user: " + ex.toString();
			}
			return "User succesfully updated!";
		}
	}
		
