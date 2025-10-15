package net.engineerdigest.journalApp.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

//import ch.qos.logback.classic.Logger;
import lombok.extern.slf4j.Slf4j;
import net.engineerdigest.journalApp.entity.JournalEntry;
import net.engineerdigest.journalApp.entity.User;
import net.engineerdigest.journalApp.repository.JournalEntryRepository;
import net.engineerdigest.journalApp.repository.UserRepository;

@Component
@Slf4j
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	//private static final Logger logger = LoggerFactory.getLogger(UserService.class);
	
	private static  final PasswordEncoder passwordEncoder =  new BCryptPasswordEncoder();

	
	public boolean saveNewUser(User user) {
		try {
			user.setPassword(passwordEncoder.encode(user.getPassword()));
			user.setRoles(Arrays.asList("USER"));
			userRepository.save(user); 
			return true;
		}
		catch(Exception e) {
			log.info("hahahahha");
			log.warn("hahahahha");

			log.debug("hahahahha");

			log.error("error occurred for {} :", user.getUserName(), e);

			log.trace("hahahahha");

			return false;
		}
		
	}
	
	public void saveUser(User user) {
		userRepository.save(user);
	}
	
	public List<User> getAll() {
		return userRepository.findAll();
	}
	
	public Optional<User> findById(ObjectId id) {
		return userRepository.findById(id);
	}
	
	public void deleteById(@PathVariable ObjectId id) {
		userRepository.deleteById(id);
	}
	
	public void updateById(@PathVariable ObjectId id) {
		userRepository.findById(id);
	}
	
	public User findByUserName(String userName) {
		return userRepository.findByUserName(userName);
	}

	public void saveAdmin(User user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		user.setRoles(Arrays.asList("USER","ADMIN"));
		userRepository.save(user); 
		
	}

	
}
