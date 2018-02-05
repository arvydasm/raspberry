package lt.pi.config;

import lt.pi.GPIOService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RaspberryConfig {

    @Bean
    public GPIOService gpioService() {
        return new GPIOService();
    }
}
