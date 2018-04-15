package cz.ucl.jee.bootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {

    @Autowired
    @Qualifier("emailerService")
    EmailService emailService;

    @RequestMapping(value = "/echo", method = RequestMethod.GET)
    public String echo() {
        return "Hello world!";
    }

    @RequestMapping(value = "/email/{address}", method = RequestMethod.POST)
    public ResponseEntity<EmailResponse> getEmail(@PathVariable("address") String address,
                                                  @RequestParam("from") String from,
                                                  @RequestBody EmailRequest request) {
        EmailResponse email = new EmailResponse();
        email.setBody(request.getText());
        email.setSender(from);
        email.setTo(address);

        return new ResponseEntity<>(email, HttpStatus.OK);
    }
}
