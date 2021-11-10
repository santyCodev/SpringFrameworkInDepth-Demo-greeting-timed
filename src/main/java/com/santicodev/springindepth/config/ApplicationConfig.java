package com.santicodev.springindepth.config;

import com.santicodev.springindepth.service.GreetingService;
import com.santicodev.springindepth.service.OutputService;
import com.santicodev.springindepth.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Value("hello")
    private String greeting;

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
        return new OutputService(greetingService, timeService);
    }

    @Bean
    public GreetingService greetingService() {
        return new GreetingService("Hello");
    }
}
