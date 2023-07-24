package Esercizio;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.epicode.IntroSpring.IntroSpringApplication;

public class Main {

	public static void main(String[] args) {
		SpringApplication.run(IntroSpringApplication.class, args);
		BeanConfig();
	}

	public static void BeanConfig() {

		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(
				ConfigurationBeans.class);
		Test B1 = (Test) appContext.getBean("test");
		Test B2 = (Test) appContext.getBean("Ciccio");

		System.out.println(B1.Info());
		System.out.println(B2.Info());
	}

}
