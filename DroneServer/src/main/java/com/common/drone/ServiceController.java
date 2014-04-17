package com.common.drone;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/service")
public class ServiceController 
{
	@RequestMapping(value = "/time", method = RequestMethod.GET)
	public String GetServerTime()
	{
		return "test_service";
	}
}
