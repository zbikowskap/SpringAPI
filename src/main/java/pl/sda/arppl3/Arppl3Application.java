package pl.sda.arppl3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// Przeszukujemy wymienione pakiety oraz pakiety podrzędne
@ComponentScan(basePackages = {"pl.sda.arppl3", "pl.sda.arppl4"})
public class Arppl3Application {

	public static void main(String[] args) {
		// Metoda run zwraca kontekst spring'a, czyli pulę obiektów, którymi zarządza.
		ConfigurableApplicationContext context = SpringApplication.run(Arppl3Application.class, args);
		// Z kontekstu możemy pobrać komponent na podstawie klasy.
		// Otrzymamy oczekiwany komponent (obiekt), pod warunkiem, że dany obiekt
		// został przez spring'a zarejestrowany.
		BookRepository bookRepository = context.getBean(BookRepository.class);
		System.out.println("....");
	}
}
