package Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import Classes.Ordini;

@Configuration
public class OrdineConfig {

	@Bean
	@Scope("Prototype")
	public Ordini Ordine() {
		Ordini o = new Ordini();
		o.
	}

}
