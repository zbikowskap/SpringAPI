package pl.sda.arppl3;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor // Realizujemy wstrzykiwanie przez konstruktor
public class BookService implements CommandLineRunner {

    // Z wykorzystaniem adnotacji @Autowired wstrzukujemy bezpośrednio do pola
    // wykorzystując mechanizm refleksji (używane w testach)
//    @Autowired
    private final BookValidator bookValidator;
//    @Autowired
    private final BookRepository bookRepository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("After BookService creation...");
    }

    // W przypadku wstrzykiwania przez konstrukcji, adnotacja @Autowired nie jest wymagana.
//    @Autowired
//    public BookService(BookValidator bookValidator, BookRepository bookRepository) {
//        this.bookValidator = bookValidator;
//        this.bookRepository = bookRepository;
//    }
}
