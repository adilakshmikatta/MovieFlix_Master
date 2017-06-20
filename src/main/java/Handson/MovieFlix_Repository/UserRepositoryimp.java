package Handson.MovieFlix_Repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import Handson.MovieFlix_EntityController.User;

@Repository
public class UserRepositoryimp implements UserRepository{
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<User> findAll() {
		TypedQuery<User> query=em.createNamedQuery("User.findAll",User.class);
		return query.getResultList();		
	}

	@Override
	public User findOne(String email) {
		return em.find(User.class,email);
	}

	@Override
	public User findByEmail(String email) {
		TypedQuery<User> query=em.createNamedQuery("User.findByEmail",User.class);
		query.setParameter("pEmail", email);
		List<User> user=query.getResultList();
		if(user!=null && user.size()==1){
			return user.get(0);
		}
		return null;
	}

	@Override
	public User create(User user) {
		System.out.println("Inside UserRepositoryImp create() ");
		 em.persist(user);
		 return user;
	}

	@Override
	public User update(User user) {
		return em.merge(user);
	}

	@Override
	public void delete(User user) {
		em.remove(user);
		}

	
		
	
}
