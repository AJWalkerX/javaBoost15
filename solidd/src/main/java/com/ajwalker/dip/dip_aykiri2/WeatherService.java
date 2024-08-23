package com.ajwalker.dip.dip_aykiri2;

public class WeatherService {
	public String getWeather(){
		return "Sunny";
	}
}

class WeatherClient{
	private WeatherService weatherService;
	public WeatherClient(){
		this.weatherService = new WeatherService();
	}
	public void displayWeather(){
		String weather = weatherService.getWeather();
		System.out.println("şu anki durumu: "+ weather);
	}
}