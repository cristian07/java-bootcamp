import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.globant.cristian.controller.ProyectController;

@Configuration
@EnableAutoConfiguration
@ComponentScan
@EnableJpaRepositories
public class Aplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ProyectController.class, args);
	}

}
