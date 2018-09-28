package windowBuilder.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.*;
import com.google.gson.reflect.*;

public class GetWeather {
	 public static Map<String, Object> jsonToMap(String str) {
		 Map<String, Object> map = new Gson().fromJson(str, new TypeToken<HashMap<String, Object>>() {}.getType());
		 return map;
	 }
	
	public double getTemperature() {
		String API_KEY = "578a4df84bc2a7a14ffe7b9140dab1d6";
		String LOCATION = "Singapore,SG";
		String urlString = "https://api.openweathermap.org/data/2.5/weather?q=" + LOCATION + "&appid=" + API_KEY + "&units=metric";
		
		double currentTemp = 0;
		
		try {
			StringBuilder result = new StringBuilder();
			URL url = new URL(urlString);
			URLConnection conn = url.openConnection();
			BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line;
			while ((line = rd.readLine()) != null) {
				result.append(line);
			}
			rd.close();
			System.out.println(result);
			
			Map<String, Object> respMap = jsonToMap(result.toString());
			Map<String, Object> mainMap = jsonToMap(respMap.get("main").toString());
			Map<String, Object> windMap = jsonToMap(respMap.get("wind").toString());
			
			System.out.println("Current Temperature: " + mainMap.get("temp"));
			System.out.println("Current Humidity: " + mainMap.get("humidity"));
			System.out.println("Wind Speeds: " + mainMap.get("speed"));
			System.out.println("Wind Angle: " + windMap.get("deg"));
			
			currentTemp = (double) mainMap.get("temp");
		} catch (IOException e) {
			System.out.print(e.getMessage());
		} return currentTemp;
	}
}
