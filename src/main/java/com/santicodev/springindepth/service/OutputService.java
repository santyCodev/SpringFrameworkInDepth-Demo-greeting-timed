package com.santicodev.springindepth.service;

public class OutputService {

    private final String name;
    private final GreetingService greetingService;
    private final TimeService timeService;

    public OutputService(String name, GreetingService greetingService, TimeService timeService){
        this.name = name;
        this.greetingService = greetingService;
        this.timeService = timeService;
    }

    public void generateOutput(){
        String output = timeService.getCurrentTime() + " " + greetingService.getGreeting(name);
        System.out.println(output);
    }

}
