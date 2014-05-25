package com.manuel.jordan.springframework.beans.javaconfig.model.repository.custom;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.manuel.jordan.model.repository.PersonRepository;
import com.manuel.jordan.model.repository.custom.PersonCustomRepository;

/**
 * <p>Configuration class.
 *    The purpose is declare a bean how a Repository.</p>
 *   
 * @author Manuel Jordan - dr_pompeii
 *
 */
@Configuration
public class SpringFrameworkModelRepositoryCustomConfiguration {

	@Bean
	public PersonRepository personRepository(){
		return new PersonCustomRepository();
	}
	
}
