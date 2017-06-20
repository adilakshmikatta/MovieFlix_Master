package Handson.MovieFlix_Repository;

import java.util.List;
import Handson.MovieFlix_EntityController.Media;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;



@Repository
public class MediaRepositoryimp implements MediaRepository{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Media> findAll() {
	
		TypedQuery<Media> query = em.createNamedQuery("Media.findAll", Media.class);
		return query.getResultList();
	}

	@Override
	public Media create(Media media) {		
		 em.persist(media);
		 return media;
	}

	
	public List<Media> findOne(String title) {
		TypedQuery<Media> query = em.createNamedQuery("Media.findOne", Media.class);
		query.setParameter("ptitle", title);		
		return query.getResultList();
		
	}

}
