package com.globant.cristian.model;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

@Transactional
public interface CoursesDao extends CrudRepository<Courses,Long> {
	
	public List<Courses> findAll();
	public Courses findByName(String c_name);
	public Courses findOne(int courses_id);
}
