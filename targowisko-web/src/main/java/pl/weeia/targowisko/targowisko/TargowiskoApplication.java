package pl.weeia.targowisko.targowisko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class TargowiskoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TargowiskoApplication.class, args);
	}

}
