package com.ops.base.RestBluePrint;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.mock;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

import static org.mockito.Mockito.*;

import com.ops.base.RestBluePrint.Domains.User;
import com.ops.base.RestBluePrint.Service.UserService;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserServiceTest {
	
	@Autowired
	private TestRestTemplate webClient;
	
	@Autowired
	private TestRestTemplate restTemplate;
	
	@Autowired
	private UserService userService;
		
	@Test
	public void test() {
		
		//userService = null;
		Assert.assertNotNull(userService);
	}
	
	/*@Test
	public void TestShouldSaveUser() {
		
		String body = this.restTemplate.getForObject("/api/user", String.class);
		assertThat(body).isEqualTo("Test");
		UserService us = Mockito.mock(UserService.class);
		User u = Mockito.mock(User.class);
		us.save(u);
	}*/

}


