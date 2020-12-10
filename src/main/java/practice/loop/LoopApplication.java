package practice.loop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class LoopApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(LoopApplication.class, args);
	}

	@override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	    return builder.sources(LoopApplication.class);
	}

}
