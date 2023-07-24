package Esercizio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigurationBeans {

	@Bean
	@Scope("singleton")
	public Test test() {
		return new Test("Ciao Mondo");
	}

	@Bean
	@Scope("singleton")
	public Test Ciccio() {
		return new Test("Ciao Ciccio");
	}
}
