package com.common.drone;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/service")
public class ServiceController 
{
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/time", method = RequestMethod.GET)
	public String GetServerTime(ModelMap model)
	{
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		
		String formattedDate = dateFormat.format(date);
		model.addAttribute("time", formattedDate);
		
		return "test_service";
	}
	
	@RequestMapping(value = "/set", method = RequestMethod.POST, headers = "Content-Type=application/x-www-form-urlencoded")
	public void SetData(@RequestBody String sample, HttpServletResponse response, HttpServletRequest request) throws IOException
	{
		logger.info(sample);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		
		String formattedDate = dateFormat.format(date);
		
		response.setContentType("text/plain");
	    response.setCharacterEncoding("UTF-8");
	    response.getOutputStream().println("received " + formattedDate);
	}
}
