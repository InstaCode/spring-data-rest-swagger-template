package io.instacode.spring.template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration;

@SpringBootApplication
@Import(SpringDataRestConfiguration.class)
public class TemplateProjectApplication {

  public static void main(String[] args) {
    SpringApplication.run(TemplateProjectApplication.class, args);
  }

}
