package ar.com.telecom.fmvue.config;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "file:///fm/prop/${prop.pref}hibernate.properties", ignoreResourceNotFound = true)
@PropertySource(value = "file:///fm/prop/${prop.pref}sap.properties", ignoreResourceNotFound = true)
@PropertySource("classpath:application.properties")
public class PropertyConfig {

	@Bean
	public PropertyPlaceholderConfigurer placeholderConfigurer() {
		
		PropertyPlaceholderConfigurer configurer = new PropertyPlaceholderConfigurer();
		configurer.setIgnoreUnresolvablePlaceholders(true);
		return configurer;
	}

}
