package net.engineerdigest.journalApp.cache;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import net.engineerdigest.journalApp.entity.ConfigJournalAppEntity;
import net.engineerdigest.journalApp.repository.ConfigJournalAppRepository;

@Component
public class AppCache {
	
	public enum keys {
		WEATHER_API
	}
	
	public Map<String,String> appCache ;	
	@Autowired
	private ConfigJournalAppRepository configJournalAppRepository;
	
	@PostConstruct
	public void init() {
		appCache = new HashMap<>();
		List<ConfigJournalAppEntity> all = configJournalAppRepository.findAll();
		for(ConfigJournalAppEntity  configJournalAppEntity : all) {
			appCache.put(configJournalAppEntity.getKey(), configJournalAppEntity.getValue());
		}
		
	}

}
