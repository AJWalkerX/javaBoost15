package com.ajwalker.dip.dip_uygun2;

import com.ajwalker.dip.dip_aykiri2.WeatherService;

public class WeatherClient {
	private IWeatherService weatherService;
	
	public WeatherClient(IWeatherService iWeatherService) {
		this.weatherService = iWeatherService;
	}
	
	public void displayWeather() {
		String weather = weatherService.getWeather();
		System.out.println("şu anki durumu: " + weather);
	}
}