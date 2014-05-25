package com.manuel.jordan.springframework.beans.central;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.manuel.jordan.springframework.beans.javaconfig.model.service.SpringFrameworkModelServiceConfiguration;
import com.manuel.jordan.springframework.beans.javaconfig.model.repository.custom.SpringFrameworkModelRepositoryCustomConfiguration;

/**
 * <p>Central Configuration class to be called from the Main class. 
 *    The purpose is import other Configuration classes.</p>
 *    
 * @author Manuel Jordan - dr_pompeii
 * 
 */
@Configuration
@Import({SpringFrameworkModelRepositoryCustomConfiguration.class, SpringFrameworkModelServiceConfiguration.class})
public class SpringFrameworkJavaConfigCentral {

}
