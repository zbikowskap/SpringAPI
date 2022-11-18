package pl.sda.arppl4;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BookBuilder implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("After BookBuilder creation!!!");
    }
}
