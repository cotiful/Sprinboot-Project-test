package site.metacoding.data_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class DataTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataTestApplication.class, args);
	}

}
