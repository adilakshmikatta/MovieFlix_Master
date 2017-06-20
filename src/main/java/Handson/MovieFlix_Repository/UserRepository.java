package Handson.MovieFlix_Repository;

import java.util.List;

import Handson.MovieFlix_EntityController.User;

public interface UserRepository {
	public List<User> findAll();
	public User findOne(String id);
	public User findByEmail(String id);
	public User create(User user);
	public User update(User user);
	public void delete(User user);
}
