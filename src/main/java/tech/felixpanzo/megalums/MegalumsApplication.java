package tech.felixpanzo.megalums;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MegalumsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MegalumsApplication.class, args);
	}

}
