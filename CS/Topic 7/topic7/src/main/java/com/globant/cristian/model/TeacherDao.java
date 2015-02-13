package com.globant.cristian.model;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;


@Transactional
public interface TeacherDao extends CrudRepository<Teacher,Long> {
	public List<Teacher> findAll();
	public Teacher findByName(String t_f_name);
	public Teacher findOne(int teacher_id);
}
