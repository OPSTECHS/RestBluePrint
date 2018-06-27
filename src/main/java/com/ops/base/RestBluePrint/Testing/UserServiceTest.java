package com.ops.base.RestBluePrint.Testing;

import org.mockito.Mockito;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;

import com.ops.base.RestBluePrint.Domains.User;
import com.ops.base.RestBluePrint.Service.UserService;

public class UserServiceTest {

	UserService userService = Mockito.mock(UserService.class);

	@Before
	public void setUp() {
		
	}
	
	@Test
	public void TestShouldSaveUser() {
		
		UserService us = mock(UserService.class);
		User u = mock(User.class);
		
		us.save(u);
		
		
	}
	
}

