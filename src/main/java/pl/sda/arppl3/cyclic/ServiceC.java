package pl.sda.arppl3.cyclic;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service

public class ServiceC {
    private final ServiceA serviceA;
// mają być lazy tworzą się dopiero kiedy muszą
    public ServiceC(@Lazy ServiceA serviceA) {
        this.serviceA = serviceA;
    }
}
