package Handson.MovieFlix_Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Handson.MovieFlix_EntityController.Media;
import Handson.MovieFlix_Repository.MediaRepository;

@Service
public class MediaServiceimp implements MediaService {

	@Autowired
	MediaRepository mediaRepo;
	
	@Override
	public List<Media> findAll() {
		
		return mediaRepo.findAll();
	}

	@Override
	@Transactional
	public Media create(Media media) {

		return mediaRepo.create(media);
	}

	@Override
	public List<Media> findOne(String title) {
		
		return   mediaRepo.findOne(title);
	}

}
