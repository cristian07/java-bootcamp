package com.globant.cristian.model;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
//@Repository
@Transactional
//@Component("studentDao")

public interface StudentDao extends CrudRepository<Student, Long> {

	public List<Student> findAll();
	public Student findByName(String s_f_name);
	public Student findOne(int student_id);
	
}
