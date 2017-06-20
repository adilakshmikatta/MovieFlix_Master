package Handson.MovieFlix_Repository;
import Handson.MovieFlix_EntityController.Media;
import java.util.List;


public interface MediaRepository  {
 public List<Media> findAll();
 public Media create(Media media); 
 public List<Media> findOne(String title);
}
