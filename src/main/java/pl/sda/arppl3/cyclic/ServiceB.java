package pl.sda.arppl3.cyclic;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service

public class ServiceB {

    private final ServiceC serviceC;

    public ServiceB(@Lazy ServiceC serviceC) {
        this.serviceC = serviceC;
    }
}
