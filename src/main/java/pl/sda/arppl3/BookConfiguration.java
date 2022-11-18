package pl.sda.arppl3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Klasa konfiguracyjna, w której mamy zdefiniowane komponenty spring'a - bean'y.
@Configuration
public class BookConfiguration {

    @Bean
    public BookRepository bookRepository() {
        return new BookRepository();
    }

    @Bean
    public BookValidator bookValidator() {
        return new BookValidator();
    }
}
