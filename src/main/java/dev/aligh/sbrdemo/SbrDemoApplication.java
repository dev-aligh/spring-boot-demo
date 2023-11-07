package dev.aligh.sbrdemo;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "School Management Api",
				version = "1.0"
		)
)
public class SbrDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbrDemoApplication.class, args);
	}

}
