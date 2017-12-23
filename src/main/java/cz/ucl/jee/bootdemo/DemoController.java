package cz.ucl.jee.bootdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	 @RequestMapping(value = "/echo", method = RequestMethod.GET)
	 public String echo() {
		 return "Hello world!";
	 }
}
