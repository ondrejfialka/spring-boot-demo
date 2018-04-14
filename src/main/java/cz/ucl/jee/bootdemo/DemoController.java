package cz.ucl.jee.bootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@Autowired
	@Qualifier("emailerService")
	EmailService emailService;
	
	 @RequestMapping(value = "/echo", method = RequestMethod.GET)
	 public String echo() {
		 return "Hello world!";
	 }
}
