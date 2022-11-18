package pl.sda.arppl3.logger;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@RequiredArgsConstructor
@Component
public class ExtHelloWorldLogger implements CommandLineRunner {
    private final SimpleLogger simpleLogger;

    @Override
    public void run(String... args) throws Exception {
        simpleLogger.printMassage("Hello SDA");
    }
}
