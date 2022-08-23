package usercrud.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import usercrud.model.User;

@Component
public class UserDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	// create User
	@Transactional
	public void createUser(User user) {

		this.hibernateTemplate.saveOrUpdate(user);
	}

	//get all view User
	public List<User> getUsers() {
		List<User> Users = this.hibernateTemplate.loadAll(User.class);
		return Users;
	}

	// delete the single project
	@Transactional
	public void deleteProduct(int id) {
		User U = this.hibernateTemplate.load(User.class, id);
		this.hibernateTemplate.delete(U);
	}
	
	//to get the single product
	public User getUser(int id) {
		return this.hibernateTemplate.get(User.class, id);
	}


}
