package Handson.MovieFlix_Service;

import java.util.List;

import Handson.MovieFlix_EntityController.User;

public interface UserService {
	public List<User> findAll();
	public User findOne(String email);
	public User create(User user);
	public User update(String id,User emp);
	public void delete(String id);

}
