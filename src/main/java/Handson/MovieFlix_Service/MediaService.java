package Handson.MovieFlix_Service;

import java.util.List;

import Handson.MovieFlix_EntityController.Media;

public interface MediaService {
	public List<Media> findAll();
	
	public Media create(Media media);
	
	public List<Media> findOne(String title);
	/*
	public Media update(String id,Media mediaid);
	public void delete(String id);
	*/
}
