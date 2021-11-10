package com.santicodev.springindepth;

import com.santicodev.springindepth.config.ApplicationConfig;
import com.santicodev.springindepth.service.OutputService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringindepthApplication {

	public static void main(String[] args) throws InterruptedException {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		OutputService outputService = context.getBean(OutputService.class);

		for (int i=0;i<5;i++){
			outputService.generateOutput();
			Thread.sleep(5000);
		}
	}

}
