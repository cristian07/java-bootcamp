package com.globant.cristian.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.globant.cristian.model.Courses;
import com.globant.cristian.model.CoursesDao;
import com.globant.cristian.model.Teacher;
import com.globant.cristian.model.TeacherDao;

@Controller
public class TeacherController {

	@Autowired
	TeacherDao teacherDao;

	public TeacherController(TeacherDao teacherDao) {
		this.teacherDao = teacherDao;
	}

	public TeacherController() {
	}

	@RequestMapping("/create")
	@ResponseBody
	public String create(String t_f_name, String t_l_name) {
		try {
			Teacher teacher = new Teacher(t_f_name, t_l_name);
			teacherDao.save(teacher);
		} catch (Exception ex) {
			return "Error creating the user: " + ex.toString();
		}
		return "Student succesfully created!";
	}

	@RequestMapping("/delete")
	@ResponseBody
	public String delete(int teacher_id) {
		try {
			Teacher teacher = new Teacher(teacher_id);
			teacherDao.delete(teacher);
		} catch (Exception ex) {
			return "Error deleting the Student:" + ex.toString();
		}
		return "Student succesfully deleted!";
	}

	@RequestMapping("/get-by-name")
	@ResponseBody
	public String getByName(String t_f_name) {
		String teacherId;
		try {
			Teacher teacher = teacherDao.findByName(t_f_name);
			teacherId = String.valueOf(teacher.getTeacher_id());
		} catch (Exception ex) {
			return "User not found";
		}
		return "The user id is: " + teacherId;
	}

	@RequestMapping("/update")
	@ResponseBody
	public String updateTeacher(int teacher_id, String t_f_name, String t_l_name) {
		try {
			Teacher teacher = teacherDao.findOne(teacher_id);
			teacher.setT_f_name(t_f_name);
			teacherDao.save(teacher);
		} catch (Exception ex) {
			return "Error updating the user: " + ex.toString();
		}
		return "User succesfully updated!";
	}
}
