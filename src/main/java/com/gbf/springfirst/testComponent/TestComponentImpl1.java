package com.gbf.springfirst.testComponent;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("testComponent1")
@Profile("dev")
public class TestComponentImpl1 implements TestComponent{
    private String info;

    @PostConstruct
    public void init(){
        this.info="Information1";
        System.out.println("Hello");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Bye");
    }

    @Override
    public void sayHello(){
        System.out.println(info);
    }
}
