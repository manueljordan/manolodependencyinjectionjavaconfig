package com.manuel.jordan.springframework.beans.javaconfig.model.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.manuel.jordan.model.service.PersonService;
import com.manuel.jordan.model.repository.PersonRepository;
import com.manuel.jordan.model.service.impl.PersonServiceImplVersion01;
import com.manuel.jordan.model.service.impl.PersonServiceImplVersion02;

/**
 * <p>Configuration class.
 *    The purpose is declare beans how a Service.</p>
 *   
 * @author Manuel Jordan - dr_pompeii
 *
 */
@Configuration
public class SpringFrameworkModelServiceConfiguration {

	@Bean
	public PersonService personService01(PersonRepository personRepository){
		
		PersonService personService = new PersonServiceImplVersion01(personRepository);
		
		return personService;
	}
	
	@Bean(name="personService02")
	public PersonService personServiceImplVersion02(PersonRepository personRepository){
		
		PersonServiceImplVersion02 personService = new PersonServiceImplVersion02();
		
		personService.setPersonRepository(personRepository);
		
		return personService;
	}
	
}
