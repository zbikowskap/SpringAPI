package pl.sda.arppl3.cyclic;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service //dodajemy jeden  ze stereotypów

public class ServiceA {

    private final ServiceB serviceB;

    public ServiceA(@Lazy ServiceB serviceB) {
        this.serviceB = serviceB;
    }
}
