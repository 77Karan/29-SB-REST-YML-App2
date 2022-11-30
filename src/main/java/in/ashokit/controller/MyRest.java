package in.ashokit.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.properties.AppProps;

@RestController
public class MyRest 
{
	@Autowired
	private AppProps appProps;
	
	@GetMapping("/welcome")
	public String welcomeMsg()
	{
		Map<String, String> mapG= appProps.getMessages();
		String msg = mapG.get("welcomeMsg");
		return msg;
	}
	
	@GetMapping("/greet")
	public String greetMsg()
	{
		Map<String,String> mapG =appProps.getMessages();
		String msg = mapG.get("greetMsg");
		return msg;
	}
	
	
	
}
