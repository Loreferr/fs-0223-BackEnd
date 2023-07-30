package Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import Classes.Menu;
import Classes.PizzaHawaian;
import Classes.PizzaMargherita;
import Classes.PizzaSalami;

@Configuration
public class MenuConfig {
	@Bean
	@Scope("singleton")
	public Menu menu() {
		Menu m = new Menu();
		m.getMenu().add(pizzaMargherita());
		m.getMenu().add(pizzaHawaian());
		m.getMenu().add(pizzaSalami());

		return m;
	}

	@Bean
	@Scope("singleton")
	public Classes.PizzaMargherita pizzaMargherita() {
		return new PizzaMargherita();
	}

	@Bean
	@Scope("singleton")
	public Classes.PizzaHawaian pizzaHawaian() {
		return new PizzaHawaian();
	}

	@Bean
	@Scope("singleton")
	public Classes.PizzaSalami pizzaSalami() {
		return new PizzaSalami();
	}
}
