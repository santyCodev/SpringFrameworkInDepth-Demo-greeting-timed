package com.santicodev.springindepth;

import com.santicodev.springindepth.service.GreetingService;
import com.santicodev.springindepth.service.OutputService;
import com.santicodev.springindepth.service.TimeService;

public class SpringindepthApplication {

	public static void main(String[] args) throws InterruptedException {

		GreetingService greetingService = new GreetingService("Hello");
		TimeService timeService = new TimeService(true);
		OutputService outputService = new OutputService(greetingService, timeService);

		for (int i=0;i<5;i++){
			outputService.generateOutput("Santi");
			Thread.sleep(5000);
		}
	}

}
