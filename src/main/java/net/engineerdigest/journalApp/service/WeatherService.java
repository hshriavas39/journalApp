package net.engineerdigest.journalApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


import net.engineerdigest.journalApp.api.response.WeatherResponse;
import net.engineerdigest.journalApp.cache.AppCache;
import net.engineerdigest.journalApp.constants.Placeholders;


@Component
public class WeatherService {
	
	
	
	@Value("${weather.api.key}")
	public   String apiKey;
	
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	private AppCache appCache;
	
	public WeatherResponse getWeather(String city) {
		String finalAPI = appCache.appCache.get(AppCache.keys.WEATHER_API.toString()).replace(Placeholders.CITY,city).replace(Placeholders.API_KEY, apiKey);
		 ResponseEntity<WeatherResponse> response = restTemplate.exchange(finalAPI, HttpMethod.GET,null,WeatherResponse.class); 
		 WeatherResponse body = response.getBody();
		 return body;
	}

}
