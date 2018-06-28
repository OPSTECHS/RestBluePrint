package com.ops.base.RestBluePrint.Testing;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.mock;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.*;

import com.ops.base.RestBluePrint.Domains.User;
import com.ops.base.RestBluePrint.Service.UserService;

public class UserServiceTest {

	UserService userService = Mockito.mock(UserService.class);

	@Before
	public void setUp() {}
	
	@Test
	public void TestShouldSaveUser() {
		
		UserService us = Mockito.mock(UserService.class);
		User u = Mockito.mock(User.class);
		
		us.save(u);
	}

	
	
}


