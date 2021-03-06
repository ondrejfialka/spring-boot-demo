package cz.ucl.jee.bootdemo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootDemoApplicationTests {

	@Autowired
	@Qualifier("emailerService")
	EmailService emailService;

	@Test
	public void contextLoads() {
		Assert.assertNotNull(emailService);
	}

}
