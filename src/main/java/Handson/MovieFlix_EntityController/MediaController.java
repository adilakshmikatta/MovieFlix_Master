package Handson.MovieFlix_EntityController;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import Handson.MovieFlix_Service.MediaService;


@RestController
@RequestMapping("/media")
public class MediaController 
{
	
	@Autowired
	MediaService mservice;
	
	@RequestMapping(method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Media> findAll(){
		return mservice.findAll();
		}
	
	@RequestMapping(method=RequestMethod.GET,path="/{title}",produces=MediaType.APPLICATION_JSON_UTF8_VALUE)	
	public List<Media> findOne(@PathVariable("title") String title){
		return  mservice.findOne(title);
		}
		
	@RequestMapping(method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_UTF8_VALUE,consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)
	
	public Media create(@RequestBody Media media){ 
		System.out.println("Inside MediaController create");
		return mservice.create(media);
		}
	
	/*
	@RequestMapping(method=RequestMethod.PUT,path="{id}",produces=MediaType.APPLICATION_JSON_UTF8_VALUE,consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)	
	public Media update(@PathVariable("id") String empid,@RequestBody Media emp){return service.update(empid, emp);}
	
	@RequestMapping(method=RequestMethod.DELETE,path="{id}")	
	public void delete(@PathVariable("id") String empid){service.delete(empid);}
	*/
}
