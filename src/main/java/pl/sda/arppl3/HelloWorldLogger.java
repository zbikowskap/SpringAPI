package pl.sda.arppl3;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class HelloWorldLogger implements CommandLineRunner {

    private final String message;

    public HelloWorldLogger(@Value("${pl.sda.arp.pl3.hello-message}")String message) {
        this.message = message;
    }

    @PostConstruct
    void postConstruct() {
        System.out.println("In postConstruct method...");
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(message);
    }
}
