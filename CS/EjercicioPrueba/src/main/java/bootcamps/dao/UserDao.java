package bootcamps.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import bootcamps.entities.User;

@Transactional
public interface UserDao extends CrudRepository<User, Long> {

}
