package Handson.MovieFlix;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackageClasses=
{		Handson.MovieFlix_EntityController.MediaController.class,
		Handson.MovieFlix_EntityController.RatingController.class,
		Handson.MovieFlix_EntityController.UserController.class,
		Handson.MovieFlix_Repository.MediaRepositoryimp.class,
		Handson.MovieFlix_Service.MediaServiceimp.class
		})
@EnableWebMvc
public class Web_Config {

}