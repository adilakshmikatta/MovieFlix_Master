package Handson.MovieFlix_EntityController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Handson.MovieFlix_Service.UserService;

@RestController
@RequestMapping("/user")
public class UserController 
{
	
	@Autowired
	UserService uservice;
	
	@RequestMapping(method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<User> findAll(){
		return uservice.findAll();
		}
	
	@RequestMapping(method=RequestMethod.GET,path="/{email}",produces=MediaType.APPLICATION_JSON_UTF8_VALUE)	
	public User findOne(@PathVariable("email") String email){
		return  uservice.findOne(email);
		}
		
	@RequestMapping(method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_UTF8_VALUE,consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)
	
	public User create(@RequestBody User user){ 
		System.out.println("Inside USerController create");
		return uservice.create(user);
		}
	
	/*
	@RequestMapping(method=RequestMethod.PUT,path="{id}",produces=MediaType.APPLICATION_JSON_UTF8_VALUE,consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)	
	public Media update(@PathVariable("id") String empid,@RequestBody Media emp){return service.update(empid, emp);}
	
	@RequestMapping(method=RequestMethod.DELETE,path="{id}")	
	public void delete(@PathVariable("id") String empid){service.delete(empid);}
	*/
}