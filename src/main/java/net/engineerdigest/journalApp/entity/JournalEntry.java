package net.engineerdigest.journalApp.entity;

import java.time.LocalDateTime;
import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "journal_entries")
@Getter
@Setter
@NoArgsConstructor
@Data
public class JournalEntry {
	
	@Id
	private ObjectId id;
	
	private String title;
	
	private String content;

	private LocalDateTime date;
	
	
}
