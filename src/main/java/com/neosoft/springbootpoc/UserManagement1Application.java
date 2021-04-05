package com.neosoft.springbootpoc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@SpringBootApplication
public class UserManagement1Application {

	public static void main(String[] args) {
		SpringApplication.run(UserManagement1Application.class, args);
	}

	/*
	 * @Bean public RestTemplate restTemplate() { final RestTemplate restTemplate =
	 * new RestTemplate();
	 * 
	 * List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
	 * MappingJackson2HttpMessageConverter converter = new
	 * MappingJackson2HttpMessageConverter();
	 * converter.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));
	 * messageConverters.add(converter);
	 * restTemplate.setMessageConverters(messageConverters);
	 * 
	 * return restTemplate; }
	 */
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
