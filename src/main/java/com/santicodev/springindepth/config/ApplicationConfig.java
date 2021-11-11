package com.santicodev.springindepth.config;

import com.santicodev.springindepth.service.GreetingService;
import com.santicodev.springindepth.service.OutputService;
import com.santicodev.springindepth.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages = "com.santicodev.springindepth")
public class ApplicationConfig {

}
