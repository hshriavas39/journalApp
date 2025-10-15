package net.engineerdigest.journalApp.repository;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import net.engineerdigest.journalApp.entity.JournalEntry;
import net.engineerdigest.journalApp.entity.User;

public interface UserRepository extends MongoRepository<User,ObjectId>{
	
	User findByUserName(String username);

	void deleteByUserName(String name);

}
