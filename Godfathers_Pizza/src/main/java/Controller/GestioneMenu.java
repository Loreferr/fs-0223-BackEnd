package Controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Classes.Menu;
import Configuration.MenuConfig;

public class GestioneMenu {
	AnnotationConfigApplicationContext appContext;
	Menu menu;

	public GestioneMenu() {
		appContext = new AnnotationConfigApplicationContext(MenuConfig.class);
		menu = (Menu) appContext.getBean("menu");
	}

	public void stampaMenu() {

		System.out.println("== Menu ==");
		System.out.println(" Pizzas");
		menu.getMenu().forEach(p -> System.out.println(p.getMenuLine()));
	}

}
