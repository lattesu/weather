package com.latte.weather.test;

import cn.com.webxml.ArrayOfString;
import cn.com.webxml.WeatherWebService;
import cn.com.webxml.WeatherWebServiceSoap;

public class WeatherTest {

	
	public static void main(String[] args) {
		WeatherWebService wws = new WeatherWebService();
		WeatherWebServiceSoap wwsp = wws.getWeatherWebServiceSoap();
		 
		ArrayOfString aos = wwsp.getWeatherbyCityName("æ£√≈");
		 for(String s : aos.getString()){
			 System.out.println(s);
		 }
	}

}
