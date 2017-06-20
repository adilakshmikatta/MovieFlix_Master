package Handson.MovieFlix_Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Handson.MovieFlix_EntityController.User;
//import Egen_Handson.spring_rest_exception.UserNotFoundException;
//import Egen_Handson.spring_rest_repository.USerRepository;
import Handson.MovieFlix_Repository.UserRepository;

@Service
public class UserServiceimp {
	@Autowired
	UserRepository repository;
	
	@Override
	public List<User> findAll() {		
		return repository.findAll();
	}

	@Override
	public User findOne(String email) {
		User existing=repository.findOne(email);
		if(existing==null){
			//throw new UserNotFoundException("User with id"+id+"Not found");
		}
		return existing;
	}

	@Override
	@Transactional
	public User create(User user) {
		/*System.out.println("Inside EmployeeServiceimp create() ");
		Employee existing=repository.findByEmail(emp.getEmail());
		if(existing!=null){
			throw new EmployeeAlreadyExistsException("Email is already in use"+emp.getEmail());
		}*/
		return repository.create(user);
	}

	@Override
	@Transactional
	public User update(String email, User user)
	{
		Employee existing=repository.findOne(id);
		if(existing==null)
		{
			throw new EmployeeNotFoundException("Employee with id"+id+"Not found");
		}
		return repository.update(emp);
	}

	@Override
	@Transactional
	public void delete(String id) 
	{
		Employee existing=repository.findOne(id);
		if(existing==null)
		{
		throw new EmployeeNotFoundException("Employee with id"+id+"Not found");
		}
		repository.delete(existing);
	}
}
