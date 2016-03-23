package com.latte.weather.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.com.webxml.ArrayOfString;
import cn.com.webxml.WeatherWebService;
import cn.com.webxml.WeatherWebServiceSoap;

public class WetherServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		WeatherWebService wws = new WeatherWebService();
		WeatherWebServiceSoap wwsp = wws.getWeatherWebServiceSoap();
		
		 String city = request.getParameter("city");
		ArrayOfString aos = wwsp.getWeatherbyCityName(city);
		
		List<String> list = new ArrayList<String>();
		 for(String s : aos.getString()){
			 list.add(s);
		 }
		 
		 out.print(list.get(1)+list.get(10));
		 out.flush();
		out.close();
	}

}
