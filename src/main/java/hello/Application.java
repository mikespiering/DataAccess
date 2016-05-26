package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {


	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}

	@Bean
	public CommandLineRunner demo(LocationRepository repository) {
		return (args) -> {
			// save a couple of customers
			repository.save(new Location("22207", "Location 1"));
			repository.save(new Location("22207", "Location 2"));
			repository.save(new Location("22208", "Location 3"));
			repository.save(new Location("22209", "Location 4"));
			repository.save(new Location("22204", "Location 5"));

		};
			
	}

}
