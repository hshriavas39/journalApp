package net.engineerdigest.journalApp.service;

import static org.mockito.Mockito.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import com.mongodb.assertions.Assertions;

import net.engineerdigest.journalApp.repository.UserRepository;

@SpringBootTest
public class UserDetailsServiceImplTest {
	
	@InjectMocks
	private UserDetailsServiceImpl userDetailsService;
	
	@MockBean
	private UserRepository userRepository;
	
	@BeforeEach
	void setUp() {
		MockitoAnnotations.initMocks(CALLS_REAL_METHODS);
	}
	
	//@Test
//	void loadUserByUsername() {
//		when(userRepository.findByUserName(ArgumentMatchers.anyString())).thenReturn((net.engineerdigest.journalApp.entity.User) User.builder().username("ram").password("asdasdasd").roles(new ArrayList<>()).build());
//		UserDetails user = userDetailsService.loadUserByUsername("ram");
//		Assertions.assertNotNull(user);
	}
	


