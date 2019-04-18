package cz.ucl.jee.bootdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoConfiguration {

  @Bean(name="emailerService")
  @Conditional(WindowsCondition.class)
  public EmailService windowsEmailerService(){
      return new WindowsEmailService();
  }

  @Bean(name="emailerService")
  @Conditional(LinuxCondition.class)
  public EmailService linuxEmailerService(){
    return new LinuxEmailService();
  }

  @Bean(name="emailerService")
  @Conditional(MacCondition.class)
  public EmailService macEmailerService(){
    return new LinuxEmailService();
  }
}