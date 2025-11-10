package net.engineerdigest.journalApp.api.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WeatherResponse {
	
	private Current current;	
	

	
	
	@Getter
	@Setter
	public class Current{
	    private int temperature;
	    
	    @JsonProperty("weather_description")
	    private List<String> weatherDescription;
	    
	    private int feelslike;
	   
	}

	

}

