package pl.sda.arppl3.logger;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
@RequiredArgsConstructor
@Component
public class SimpleConsoleLogger implements SimpleLogger {

    @Override
    public void printMassage(String massage) {
       // System.out.println("Simple massage"+ message);
    }

}
