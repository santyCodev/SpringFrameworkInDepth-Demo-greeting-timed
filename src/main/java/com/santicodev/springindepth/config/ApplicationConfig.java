package com.santicodev.springindepth.config;

import com.santicodev.springindepth.service.GreetingService;
import com.santicodev.springindepth.service.OutputService;
import com.santicodev.springindepth.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class ApplicationConfig {

    @Value("${app.greeting}")
    private String greeting;

    @Value("${app.name}")
    private String name;

    @Autowired
    private GreetingService greetingService;

    @Autowired
    private TimeService timeService;

    @Bean
    public TimeService timeService() {
        return new TimeService(true);
    }

    @Bean
    public OutputService outputService() {
        return new OutputService(name, greetingService, timeService);
    }

    @Bean
    public GreetingService greetingService() {
        return new GreetingService(greeting);
    }
}
