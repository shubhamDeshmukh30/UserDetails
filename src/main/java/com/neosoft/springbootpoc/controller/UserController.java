package com.neosoft.springbootpoc.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.neosoft.springbootpoc.entity.Address;
import com.neosoft.springbootpoc.entity.User;

@RestController
public class UserController {

	@Autowired
	private RestTemplate restTemplate;

	private static final String LINK = "http://localhost:8102/fetch";
	private static final String LINK1 = "http://localhost:8102/fetchByCityname";
	private static final String LINK2 = "http://localhost:8102/remove/";

	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	public User fetchUser(@PathVariable("id") int id) {
		ResponseEntity<User> response = restTemplate.getForEntity(LINK + "/" + id, User.class);
		System.out.println(response);
		return response.getBody();

	}

	@GetMapping("/fetchBy/{city}")
	public List<User> fetchAllUserByCityName(@PathVariable("city") String city) {
		ResponseEntity<User[]> getUser = restTemplate.getForEntity(LINK1 + "/" + city, User[].class);
		List<User> list = Arrays.asList(getUser.getBody());
		return list;
	}

	/*
	 * @RequestMapping(value = "/remove/{id}",method = RequestMethod.DELETE) public
	 * Object removeUser(@PathVariable("id") int id) {
	 * 
	 * HttpHeaders headers = new HttpHeaders();
	 * 
	 * HttpEntity httpEntity = new HttpEntity(headers);
	 * 
	 * ResponseEntity<Integer> msg = restTemplate.exchange(LINK2 + "/" + id,
	 * HttpMethod.DELETE, httpEntity, Integer.class); return msg; }
	 * 
	 */
}
